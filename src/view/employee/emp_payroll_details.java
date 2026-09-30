package view.employee;

import controller.EmployeePayrollController;
import model.Session;
import model.PayrollRecord;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;


public class emp_payroll_details extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(emp_payroll_details.class.getName());
    
    private List<PayrollRecord> payrollRecords;
    public emp_payroll_details() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);   
        loadPayrollDetails();
        setupTableButtonListener();
    }
    
    private void loadPayrollDetails() {
        EmployeePayrollController controller = new EmployeePayrollController();
        payrollRecords = controller.getPayrollRecords();
        
        String[] columns = {"Pay Period", "Gross", "Deduction", "Net Pay", "Slip"};
        DefaultTableModel model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        for (PayrollRecord record : payrollRecords) {
            model.addRow(new Object[]{
                record.getPayDate(),
                String.format("%.2f", record.getGrossSalary()),
                String.format("%.2f", record.getTotalDeductions()),
                String.format("%.2f", record.getNetSalary()),
                "View"
            });
        }
        
        payroll_table.setModel(model);
    }
    private void setupTableButtonListener() {
        payroll_table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = payroll_table.rowAtPoint(evt.getPoint());
                int col = payroll_table.columnAtPoint(evt.getPoint());
                
                if (col == 4 && row >= 0 && row < payrollRecords.size()) {
                    int payrollId = payrollRecords.get(row).getPayrollId();
                    openPayslip(payrollId);
                }
            }
        });
    }
    
    
     
     
     private void openPayslip(int payrollId) {
        emp_payslip payslip = new emp_payslip(payrollId);
        payslip.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        dashboard_button = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        my_profile_button = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        payroll_history_button = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        welcome_ui = new javax.swing.JPanel();
        welcome_title = new javax.swing.JLabel();
        welcome_subtitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payroll_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 768));
        setSize(new java.awt.Dimension(1280, 768));

        sidebar.setBackground(new java.awt.Color(31, 42, 64));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/150x150.png"))); // NOI18N

        dashboard_button.setBackground(new java.awt.Color(31, 42, 64));
        dashboard_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dashboard_button.setForeground(new java.awt.Color(228, 235, 251));
        dashboard_button.setText("Dashboard");
        dashboard_button.setBorder(null);
        dashboard_button.setBorderPainted(false);
        dashboard_button.setContentAreaFilled(false);
        dashboard_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_button.addActionListener(this::dashboard_buttonActionPerformed);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N

        my_profile_button.setBackground(new java.awt.Color(31, 42, 64));
        my_profile_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        my_profile_button.setForeground(new java.awt.Color(228, 235, 251));
        my_profile_button.setText("My Profile");
        my_profile_button.setBorder(null);
        my_profile_button.setBorderPainted(false);
        my_profile_button.setContentAreaFilled(false);
        my_profile_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        my_profile_button.setFocusPainted(false);
        my_profile_button.setOpaque(true);
        my_profile_button.addActionListener(this::my_profile_buttonActionPerformed);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile.png"))); // NOI18N
        jLabel15.setToolTipText("");

        payroll_history_button.setBackground(new java.awt.Color(31, 42, 64));
        payroll_history_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        payroll_history_button.setForeground(new java.awt.Color(228, 235, 251));
        payroll_history_button.setText("Payroll Details");
        payroll_history_button.setBorder(null);
        payroll_history_button.setBorderPainted(false);
        payroll_history_button.setContentAreaFilled(false);
        payroll_history_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payroll_history_button.setFocusPainted(false);
        payroll_history_button.setOpaque(true);
        payroll_history_button.addActionListener(this::payroll_history_buttonActionPerformed);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/detail.png"))); // NOI18N

        logout_button.setBackground(new java.awt.Color(63, 114, 175));
        logout_button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setText("Logout");
        logout_button.setBorder(null);
        logout_button.addActionListener(this::logout_buttonActionPerformed);

        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(this::btnChangePasswordActionPerformed);

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChangePassword)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(my_profile_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dashboard_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(payroll_history_button))
                .addGap(99, 99, 99))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dashboard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(my_profile_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(payroll_history_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnChangePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(244, 246, 248));
        jPanel1.setForeground(new java.awt.Color(244, 246, 248));

        welcome_ui.setBackground(new java.awt.Color(219, 233, 244));

        welcome_title.setBackground(new java.awt.Color(0, 0, 0));
        welcome_title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        welcome_title.setForeground(new java.awt.Color(0, 0, 0));
        welcome_title.setText("Payroll Details");

        welcome_subtitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        welcome_subtitle.setForeground(new java.awt.Color(143, 143, 143));
        welcome_subtitle.setText("Payroll Management System");

        javax.swing.GroupLayout welcome_uiLayout = new javax.swing.GroupLayout(welcome_ui);
        welcome_ui.setLayout(welcome_uiLayout);
        welcome_uiLayout.setHorizontalGroup(
            welcome_uiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_uiLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(welcome_uiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome_subtitle)
                    .addComponent(welcome_title))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        welcome_uiLayout.setVerticalGroup(
            welcome_uiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_uiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(welcome_title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome_subtitle)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(219, 233, 244));

        payroll_table.setAutoCreateRowSorter(true);
        payroll_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        payroll_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pay Period", "Gross", "Deduction", "Net Pay", "Slip"
            }
        ));
        payroll_table.setToolTipText("");
        payroll_table.setName(""); // NOI18N
        payroll_table.setRowHeight(40);
        payroll_table.setShowGrid(false);
        jScrollPane1.setViewportView(payroll_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(welcome_ui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(welcome_ui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_buttonActionPerformed
        emp_dashboard dashboard = new emp_dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboard_buttonActionPerformed

    private void my_profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_profile_buttonActionPerformed
        emp_profile profile = new emp_profile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_my_profile_buttonActionPerformed

    private void payroll_history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_history_buttonActionPerformed
        emp_payroll_details details = new emp_payroll_details();
        details.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_history_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to logout?", "Logout",
            JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Session.destroySession();
            new emp_login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        emp_change_password changePassword = new emp_change_password();
        changePassword.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new emp_payroll_details().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton dashboard_button;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton my_profile_button;
    private javax.swing.JButton payroll_history_button;
    private javax.swing.JTable payroll_table;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel welcome_subtitle;
    private javax.swing.JLabel welcome_title;
    private javax.swing.JPanel welcome_ui;
    // End of variables declaration//GEN-END:variables

}
