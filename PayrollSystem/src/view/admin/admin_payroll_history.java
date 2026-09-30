package view.admin;

import controller.PayrollController;
import controller.PayrollSearchController;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.TableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import model.Session;

public class admin_payroll_history extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(admin_payroll_history.class.getName());
    private Timer searchTimer;
    public admin_payroll_history() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        loadPayrollHistory();
        setupSearch();
    }
    
    private void loadPayrollHistory() {
    PayrollController controller = new PayrollController();
    payroll_table.setModel(controller.getPayrollHistory());
    }
    
    private void setupSearch() {
        // Search when user presses Enter
        txtSearchEmployee.addActionListener(e -> performSearch());
        
        // Add key listener for real-time search with delay
        txtSearchEmployee.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                // Delay search to avoid too many queries while typing
                if (searchTimer != null && searchTimer.isRunning()) {
                    searchTimer.stop();
                }
                searchTimer = new Timer(500, evt -> performSearch());
                searchTimer.setRepeats(false);
                searchTimer.start();
            }
        });
    }
    
    
    
    private void performSearch() {
        String searchTerm = txtSearchEmployee.getText().trim();
        
        try {
            if (searchTerm.isEmpty()) {
                // If search is empty, use PayrollController to load all records
                PayrollController controller = new PayrollController();
                payroll_table.setModel(controller.getPayrollHistory());
            } else {
                // If searching, use PayrollSearchController
                PayrollSearchController searchController = new PayrollSearchController();
                TableModel model = searchController.searchPayrollHistory(searchTerm);
                payroll_table.setModel(model);
                
                // Optional: Show result count
                int rowCount = payroll_table.getRowCount();
                if (rowCount == 0) {
                    JOptionPane.showMessageDialog(this, 
                        "No records found for: " + searchTerm, 
                        "Search Result", 
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        } catch (Exception e) {
            logger.log(java.util.logging.Level.SEVERE, "Error searching payroll history", e);
            JOptionPane.showMessageDialog(this, 
                "Error searching records: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar3 = new javax.swing.JPanel();
        dashboard_button3 = new javax.swing.JButton();
        dashboard_icon3 = new javax.swing.JLabel();
        emp_mgmt_button3 = new javax.swing.JButton();
        emp_mgmt_icon3 = new javax.swing.JLabel();
        payroll_input_button3 = new javax.swing.JButton();
        payroll_input_icon3 = new javax.swing.JLabel();
        payroll_history_button3 = new javax.swing.JButton();
        payroll_history_icon3 = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payroll_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearchEmployee = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar3.setBackground(new java.awt.Color(31, 42, 64));

        dashboard_button3.setBackground(new java.awt.Color(31, 42, 64));
        dashboard_button3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dashboard_button3.setForeground(new java.awt.Color(228, 235, 251));
        dashboard_button3.setText("Dashboard");
        dashboard_button3.setBorder(null);
        dashboard_button3.setBorderPainted(false);
        dashboard_button3.setContentAreaFilled(false);
        dashboard_button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_button3.setFocusPainted(false);
        dashboard_button3.setMaximumSize(new java.awt.Dimension(188, 55));
        dashboard_button3.setMinimumSize(new java.awt.Dimension(188, 55));
        dashboard_button3.setOpaque(true);
        dashboard_button3.setPreferredSize(new java.awt.Dimension(188, 55));
        dashboard_button3.addActionListener(this::dashboard_button3ActionPerformed);

        dashboard_icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N

        emp_mgmt_button3.setBackground(new java.awt.Color(31, 42, 64));
        emp_mgmt_button3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emp_mgmt_button3.setForeground(new java.awt.Color(228, 235, 251));
        emp_mgmt_button3.setText("Employee Management");
        emp_mgmt_button3.setBorder(null);
        emp_mgmt_button3.setBorderPainted(false);
        emp_mgmt_button3.setContentAreaFilled(false);
        emp_mgmt_button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_mgmt_button3.setFocusPainted(false);
        emp_mgmt_button3.setMaximumSize(new java.awt.Dimension(188, 55));
        emp_mgmt_button3.setMinimumSize(new java.awt.Dimension(188, 55));
        emp_mgmt_button3.setOpaque(true);
        emp_mgmt_button3.setPreferredSize(new java.awt.Dimension(188, 55));
        emp_mgmt_button3.addActionListener(this::emp_mgmt_button3ActionPerformed);

        emp_mgmt_icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp_mgmt_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/users.png"))); // NOI18N

        payroll_input_button3.setBackground(new java.awt.Color(31, 42, 64));
        payroll_input_button3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        payroll_input_button3.setForeground(new java.awt.Color(228, 235, 251));
        payroll_input_button3.setText("Payroll Input");
        payroll_input_button3.setBorder(null);
        payroll_input_button3.setBorderPainted(false);
        payroll_input_button3.setContentAreaFilled(false);
        payroll_input_button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payroll_input_button3.setFocusPainted(false);
        payroll_input_button3.setMaximumSize(new java.awt.Dimension(188, 55));
        payroll_input_button3.setMinimumSize(new java.awt.Dimension(188, 55));
        payroll_input_button3.setOpaque(true);
        payroll_input_button3.setPreferredSize(new java.awt.Dimension(188, 55));
        payroll_input_button3.addActionListener(this::payroll_input_button3ActionPerformed);

        payroll_input_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/payroll.png"))); // NOI18N

        payroll_history_button3.setBackground(new java.awt.Color(31, 42, 64));
        payroll_history_button3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        payroll_history_button3.setForeground(new java.awt.Color(228, 235, 251));
        payroll_history_button3.setText("Payroll History");
        payroll_history_button3.setBorder(null);
        payroll_history_button3.setBorderPainted(false);
        payroll_history_button3.setContentAreaFilled(false);
        payroll_history_button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payroll_history_button3.setFocusPainted(false);
        payroll_history_button3.setMaximumSize(new java.awt.Dimension(188, 55));
        payroll_history_button3.setMinimumSize(new java.awt.Dimension(188, 55));
        payroll_history_button3.setOpaque(true);
        payroll_history_button3.setPreferredSize(new java.awt.Dimension(188, 55));
        payroll_history_button3.addActionListener(this::payroll_history_button3ActionPerformed);

        payroll_history_icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payroll_history_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/history.png"))); // NOI18N

        logout_button.setBackground(new java.awt.Color(63, 114, 175));
        logout_button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setText("Logout");
        logout_button.setBorder(null);
        logout_button.setPreferredSize(new java.awt.Dimension(88, 55));
        logout_button.addActionListener(this::logout_buttonActionPerformed);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/150x150.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(219, 233, 244));

        payroll_table.setAutoCreateRowSorter(true);
        payroll_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        payroll_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Period", "Net Pay"
            }
        ));
        payroll_table.setToolTipText("");
        payroll_table.setName(""); // NOI18N
        payroll_table.setRowHeight(40);
        payroll_table.setShowGrid(false);
        jScrollPane1.setViewportView(payroll_table);

        jPanel1.setBackground(new java.awt.Color(219, 233, 244));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Payroll History");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(143, 143, 143));
        jLabel3.setText("Payroll Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Search Employee:");

        txtSearchEmployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(42, 140, 78));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("EXCEL");

        jButton2.setBackground(new java.awt.Color(26, 75, 157));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("WORD");

        jButton3.setBackground(new java.awt.Color(181, 31, 31));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("PDF");

        jButton4.setBackground(new java.awt.Color(76, 83, 96));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("COPY");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebar3Layout = new javax.swing.GroupLayout(sidebar3);
        sidebar3.setLayout(sidebar3Layout);
        sidebar3Layout.setHorizontalGroup(
            sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar3Layout.createSequentialGroup()
                .addGroup(sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sidebar3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sidebar3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payroll_history_icon3)
                            .addComponent(emp_mgmt_icon3)
                            .addComponent(dashboard_icon3)
                            .addComponent(payroll_input_icon3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_mgmt_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payroll_input_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payroll_history_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(dashboard_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebar3Layout.setVerticalGroup(
            sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(50, 50, 50)
                .addGroup(sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard_icon3))
                .addGap(100, 100, 100)
                .addGroup(sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emp_mgmt_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(emp_mgmt_icon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payroll_input_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(payroll_input_icon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payroll_history_icon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payroll_history_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(sidebar3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sidebar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboard_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_button3ActionPerformed
        admin_dashboard dashboard = new admin_dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboard_button3ActionPerformed

    private void emp_mgmt_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_mgmt_button3ActionPerformed
        admin_employee_management emp_management = new admin_employee_management();
        emp_management.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_emp_mgmt_button3ActionPerformed

    private void payroll_input_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_input_button3ActionPerformed
        admin_input_payroll input_payroll = new admin_input_payroll();
        input_payroll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_input_button3ActionPerformed

    private void payroll_history_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_history_button3ActionPerformed
        admin_payroll_history payroll_history = new admin_payroll_history();
        payroll_history.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_history_button3ActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        logout_button.addActionListener(e -> {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            Session.destroySession();
            
            admin_login adLogin = new admin_login();
            adLogin.setVisible(true);
            this.dispose();
        }
        });
    }//GEN-LAST:event_logout_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new admin_payroll_history().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard_button3;
    private javax.swing.JLabel dashboard_icon3;
    private javax.swing.JButton emp_mgmt_button3;
    private javax.swing.JLabel emp_mgmt_icon3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton payroll_history_button3;
    private javax.swing.JLabel payroll_history_icon3;
    private javax.swing.JButton payroll_input_button3;
    private javax.swing.JLabel payroll_input_icon3;
    private javax.swing.JTable payroll_table;
    private javax.swing.JPanel sidebar3;
    private javax.swing.JTextField txtSearchEmployee;
    // End of variables declaration//GEN-END:variables
}
