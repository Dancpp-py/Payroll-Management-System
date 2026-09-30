package view.admin;

import controller.PayrollController;
import controller.EmployeeController;
import javax.swing.JOptionPane;
import model.Session;
public class admin_dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(admin_dashboard.class.getName());

    public admin_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        loadPayrollSummary();
        loadEmployeeCounts();
    }
    
    private void loadPayrollSummary() {
        PayrollController controller = new PayrollController();
        payroll_table.setModel(controller.getPayrollSummary());
    } 
    
    private void loadEmployeeCounts() {
        EmployeeController controller = new EmployeeController();
        int[] counts = controller.getEmployeeCounts();
        txtTotalEmp.setText(String.valueOf(counts[1]));
        txtActiveEmp.setText(String.valueOf(counts[1]));
        txtInactiveEmp.setText(String.valueOf(counts[2]));
    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard_panel = new javax.swing.JPanel();
        welcome_ui = new javax.swing.JPanel();
        welcome_title = new javax.swing.JLabel();
        welcome_subtitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalEmp = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtInactiveEmp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtActiveEmp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payroll_table = new javax.swing.JTable();
        sidebar = new javax.swing.JPanel();
        dashboard_button = new javax.swing.JButton();
        dashboard_icon = new javax.swing.JLabel();
        emp_mgmt_button = new javax.swing.JButton();
        emp_mgmt_icon = new javax.swing.JLabel();
        payroll_input_button = new javax.swing.JButton();
        payroll_input_icon = new javax.swing.JLabel();
        payroll_history_button = new javax.swing.JButton();
        payroll_history_icon = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 768));

        dashboard_panel.setBackground(new java.awt.Color(244, 246, 248));
        dashboard_panel.setPreferredSize(new java.awt.Dimension(1280, 768));

        welcome_ui.setBackground(new java.awt.Color(219, 233, 244));

        welcome_title.setBackground(new java.awt.Color(0, 0, 0));
        welcome_title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        welcome_title.setForeground(new java.awt.Color(0, 0, 0));
        welcome_title.setText("Welcome, Admin!");

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

        jPanel4.setBackground(new java.awt.Color(51, 79, 109));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 170));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Total Employees");

        txtTotalEmp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtTotalEmp.setText("jLabel5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(txtTotalEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(txtTotalEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 79, 109));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Inctive Employees");

        txtInactiveEmp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtInactiveEmp.setText("jLabel5");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(72, 72, 72))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(txtInactiveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(txtInactiveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(51, 79, 109));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Active Employees");

        txtActiveEmp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtActiveEmp.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(txtActiveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(txtActiveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        jScrollPane1.setBackground(new java.awt.Color(219, 233, 244));

        payroll_table.setAutoCreateRowSorter(true);
        payroll_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        payroll_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Gross", "Deduction", "Net Pay"
            }
        ));
        payroll_table.setToolTipText("");
        payroll_table.setName(""); // NOI18N
        payroll_table.setRowHeight(40);
        payroll_table.setShowGrid(false);
        jScrollPane1.setViewportView(payroll_table);

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome_ui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jScrollPane1)
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(welcome_ui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidebar.setBackground(new java.awt.Color(31, 42, 64));

        dashboard_button.setBackground(new java.awt.Color(31, 42, 64));
        dashboard_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dashboard_button.setForeground(new java.awt.Color(228, 235, 251));
        dashboard_button.setText("Dashboard");
        dashboard_button.setBorder(null);
        dashboard_button.setBorderPainted(false);
        dashboard_button.setContentAreaFilled(false);
        dashboard_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_button.setFocusPainted(false);
        dashboard_button.setOpaque(true);
        dashboard_button.addActionListener(this::dashboard_buttonActionPerformed);

        dashboard_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N

        emp_mgmt_button.setBackground(new java.awt.Color(31, 42, 64));
        emp_mgmt_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emp_mgmt_button.setForeground(new java.awt.Color(228, 235, 251));
        emp_mgmt_button.setText("Employee Management");
        emp_mgmt_button.setBorder(null);
        emp_mgmt_button.setBorderPainted(false);
        emp_mgmt_button.setContentAreaFilled(false);
        emp_mgmt_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_mgmt_button.addActionListener(this::emp_mgmt_buttonActionPerformed);

        emp_mgmt_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/users.png"))); // NOI18N

        payroll_input_button.setBackground(new java.awt.Color(31, 42, 64));
        payroll_input_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        payroll_input_button.setForeground(new java.awt.Color(228, 235, 251));
        payroll_input_button.setText("Payroll Input");
        payroll_input_button.setBorder(null);
        payroll_input_button.setBorderPainted(false);
        payroll_input_button.setContentAreaFilled(false);
        payroll_input_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payroll_input_button.setFocusPainted(false);
        payroll_input_button.setOpaque(true);
        payroll_input_button.addActionListener(this::payroll_input_buttonActionPerformed);

        payroll_input_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payroll_input_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/payroll.png"))); // NOI18N

        payroll_history_button.setBackground(new java.awt.Color(31, 42, 64));
        payroll_history_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        payroll_history_button.setForeground(new java.awt.Color(228, 235, 251));
        payroll_history_button.setText("Payroll History");
        payroll_history_button.setBorder(null);
        payroll_history_button.setBorderPainted(false);
        payroll_history_button.setContentAreaFilled(false);
        payroll_history_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payroll_history_button.setFocusPainted(false);
        payroll_history_button.setOpaque(true);
        payroll_history_button.addActionListener(this::payroll_history_buttonActionPerformed);

        payroll_history_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payroll_history_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/history.png"))); // NOI18N

        logout_button.setBackground(new java.awt.Color(63, 114, 175));
        logout_button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setText("Logout");
        logout_button.setBorder(null);
        logout_button.addActionListener(this::logout_buttonActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/150x150.png"))); // NOI18N

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emp_mgmt_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payroll_input_icon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payroll_history_icon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payroll_history_button)
                    .addComponent(payroll_input_button)
                    .addComponent(emp_mgmt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(dashboard_button))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dashboard_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emp_mgmt_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emp_mgmt_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(payroll_input_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payroll_input_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payroll_history_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payroll_history_icon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dashboard_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payroll_input_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_input_buttonActionPerformed
        admin_input_payroll input_payroll = new admin_input_payroll();
        input_payroll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_input_buttonActionPerformed

    private void emp_mgmt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_mgmt_buttonActionPerformed
        admin_employee_management emp_management = new admin_employee_management();
        emp_management.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_emp_mgmt_buttonActionPerformed

    private void dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_buttonActionPerformed
        admin_dashboard dashboard = new admin_dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboard_buttonActionPerformed

    private void payroll_history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_history_buttonActionPerformed
        admin_payroll_history payroll_history = new admin_payroll_history();
        payroll_history.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_history_buttonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new admin_dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard_button;
    private javax.swing.JLabel dashboard_icon;
    private javax.swing.JPanel dashboard_panel;
    private javax.swing.JButton emp_mgmt_button;
    private javax.swing.JLabel emp_mgmt_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton payroll_history_button;
    private javax.swing.JLabel payroll_history_icon;
    private javax.swing.JButton payroll_input_button;
    private javax.swing.JLabel payroll_input_icon;
    private javax.swing.JTable payroll_table;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel txtActiveEmp;
    private javax.swing.JLabel txtInactiveEmp;
    private javax.swing.JLabel txtTotalEmp;
    private javax.swing.JLabel welcome_subtitle;
    private javax.swing.JLabel welcome_title;
    private javax.swing.JPanel welcome_ui;
    // End of variables declaration//GEN-END:variables
}
