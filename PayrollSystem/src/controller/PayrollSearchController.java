
package controller;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PayrollSearchController {
     public TableModel getPayrollHistory() {
        try {
               Connection conn = DatabaseConnection.getConnection();
               String sql = "SELECT p.payroll_id, e.employee_id, e.first_name, e.last_name, " +
                            "p.pay_date, " +
                            "ss.net_salary " +
                            "FROM payroll p " +
                            "JOIN employees e ON p.employee_id = e.employee_id " +
                            "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id " +
                            "ORDER BY p.payroll_id DESC";

               PreparedStatement pst = conn.prepareStatement(sql);
               ResultSet rs = pst.executeQuery();

               return buildTableModel(rs);

           } catch (Exception e) {
               e.printStackTrace();
               return new DefaultTableModel();
           }
    }

    public TableModel searchPayrollHistory(String searchTerm) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT p.payroll_id, e.employee_id, e.first_name, e.last_name, " +
                     "p.pay_date, " +
                     "ss.net_salary " +
                     "FROM payroll p " +
                     "JOIN employees e ON p.employee_id = e.employee_id " +
                     "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id " +
                     "WHERE LOWER(e.first_name) LIKE LOWER(?) OR " +
                     "LOWER(e.last_name) LIKE LOWER(?) OR " +
                     "LOWER(CONCAT(e.first_name, ' ', e.last_name)) LIKE LOWER(?) OR " +
                     "CAST(e.employee_id AS CHAR) LIKE ? " +
                     "ORDER BY p.payroll_id DESC";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            String searchPattern = "%" + searchTerm + "%";
            pst.setString(1, searchPattern);
            pst.setString(2, searchPattern);
            pst.setString(3, searchPattern);
            pst.setString(4, searchPattern);
            
            ResultSet rs = pst.executeQuery();
            
            return buildTableModel(rs);
            
        } catch (Exception e) {
            e.printStackTrace();
            return new DefaultTableModel();
        }
    }

    private TableModel buildTableModel(ResultSet rs) throws Exception {
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        
        // Get column names
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i-1] = metaData.getColumnLabel(i);
        }
        
        // Get data
        ArrayList<Object[]> data = new ArrayList<>();
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i-1] = rs.getObject(i);
            }
            data.add(row);
        }
        
        // Convert to array
        Object[][] dataArray = data.toArray(new Object[0][]);
        
        return new DefaultTableModel(dataArray, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }
}
