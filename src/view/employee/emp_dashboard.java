package view.employee;

import controller.EmployeeDashboardController;
import model.Session;
import javax.swing.JOptionPane;

public class emp_dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(emp_dashboard.class.getName());

    public emp_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        loadDashboard();
    }
    private void loadDashboard(){
        EmployeeDashboardController controller = new EmployeeDashboardController();
        welcome_title.setText(controller.getWelcomeMessage());
        txtPaySummary.setText(controller.getPayrollSummaryDisplay());
        txtEmpInfo.setText(controller.getEmploymentInfoDisplay());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard_panel = new javax.swing.JPanel();
        welcome_ui = new javax.swing.JPanel();
        welcome_title = new javax.swing.JLabel();
        welcome_subtitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPaySummary = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEmpInfo = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        dashboard_button = new javax.swing.JButton();
        dashboard_icon = new javax.swing.JLabel();
        my_profile_button = new javax.swing.JButton();
        my_profile_icon = new javax.swing.JLabel();
        payroll_details_button = new javax.swing.JButton();
        payroll_details_icon = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 768));

        dashboard_panel.setBackground(new java.awt.Color(244, 246, 248));
        dashboard_panel.setPreferredSize(new java.awt.Dimension(1280, 768));

        welcome_ui.setBackground(new java.awt.Color(219, 233, 244));

        welcome_title.setBackground(new java.awt.Color(0, 0, 0));
        welcome_title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        welcome_title.setForeground(new java.awt.Color(0, 0, 0));
        welcome_title.setText("Welcome, user!");

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
                .addContainerGap(705, Short.MAX_VALUE))
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

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Last Payroll Summary");

        txtPaySummary.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPaySummary.setForeground(new java.awt.Color(0, 0, 0));
        txtPaySummary.setText("Basic Salary, Deductions, Net pay");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel8)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPaySummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(txtPaySummary, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 79, 109));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Employment Information");

        txtEmpInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmpInfo.setForeground(new java.awt.Color(0, 0, 0));
        txtEmpInfo.setText("Employment status, Department, date hired");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmpInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addComponent(txtEmpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome_ui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(welcome_ui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(273, Short.MAX_VALUE))
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

        my_profile_button.setBackground(new java.awt.Color(31, 42, 64));
        my_profile_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        my_profile_button.setForeground(new java.awt.Color(228, 235, 251));
        my_profile_button.setText("My Profile");
        my_profile_button.setBorder(null);
        my_profile_button.setBorderPainted(false);
        my_profile_button.setContentAreaFilled(false);
        my_profile_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        my_profile_button.addActionListener(this::my_profile_buttonActionPerformed);

        my_profile_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile.png"))); // NOI18N

        payroll_details_button.setBackground(new java.awt.Color(31, 42, 64));
        payroll_details_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        payroll_details_button.setForeground(new java.awt.Color(228, 235, 251));
        payroll_details_button.setText("Payroll Details");
        payroll_details_button.setBorder(null);
        payroll_details_button.setBorderPainted(false);
        payroll_details_button.setContentAreaFilled(false);
        payroll_details_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payroll_details_button.setFocusPainted(false);
        payroll_details_button.setOpaque(true);
        payroll_details_button.addActionListener(this::payroll_details_buttonActionPerformed);

        payroll_details_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payroll_details_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/detail.png"))); // NOI18N

        logout_button.setBackground(new java.awt.Color(63, 114, 175));
        logout_button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setText("Logout");
        logout_button.setBorder(null);
        logout_button.addActionListener(this::logout_buttonActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/150x150.png"))); // NOI18N

        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(this::btnChangePasswordActionPerformed);

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_profile_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payroll_details_icon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChangePassword)
                    .addComponent(payroll_details_button)
                    .addComponent(jLabel1)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(my_profile_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dashboard_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
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
                    .addComponent(my_profile_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_profile_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(payroll_details_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payroll_details_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(btnChangePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void payroll_details_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_details_buttonActionPerformed
        emp_payroll_details details = new emp_payroll_details();
        details.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_details_buttonActionPerformed

    private void my_profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_profile_buttonActionPerformed
        emp_profile profile = new emp_profile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_my_profile_buttonActionPerformed

    private void dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_buttonActionPerformed
        emp_dashboard dashboard = new emp_dashboard();
        dashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_dashboard_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to logout?", "Logout",
            JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Session.destroySession();
            emp_login emp = new emp_login();
            emp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        emp_change_password changePassword = new emp_change_password();
        changePassword.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new emp_dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton dashboard_button;
    private javax.swing.JLabel dashboard_icon;
    private javax.swing.JPanel dashboard_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton my_profile_button;
    private javax.swing.JLabel my_profile_icon;
    private javax.swing.JButton payroll_details_button;
    private javax.swing.JLabel payroll_details_icon;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel txtEmpInfo;
    private javax.swing.JLabel txtPaySummary;
    private javax.swing.JLabel welcome_subtitle;
    private javax.swing.JLabel welcome_title;
    private javax.swing.JPanel welcome_ui;
    // End of variables declaration//GEN-END:variables
}
