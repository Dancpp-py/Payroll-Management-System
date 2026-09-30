package view.employee;

import controller.EmployeeProfileController;
import model.Session;
import javax.swing.JOptionPane;

public class emp_profile extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(emp_profile.class.getName());

    public emp_profile() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false); 
        loadProfile();
    }
    
        private void loadProfile() {
        EmployeeProfileController controller = new EmployeeProfileController();
        String[] profile = controller.getEmployeeProfile();
        if (profile != null) {
            lblEmployeeID.setText(profile[0]);
            lblName.setText(profile[1]);
            lblPosition.setText(profile[2]);
            lblDepartment.setText(profile[3]);
            lblStatus.setText(profile[4]);
            lblDateHired.setText(profile[5]);
        } else {
            JOptionPane.showMessageDialog(this, "No profile found.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        emp_dashboard = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        emp_profile = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        empPayrollDetails = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDateHired = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        welcome_ui = new javax.swing.JPanel();
        welcome_title = new javax.swing.JLabel();
        welcome_subtitle = new javax.swing.JLabel();
        welcome_title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 768));
        setSize(new java.awt.Dimension(1280, 768));

        sidebar.setBackground(new java.awt.Color(31, 42, 64));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/150x150.png"))); // NOI18N

        emp_dashboard.setBackground(new java.awt.Color(31, 42, 64));
        emp_dashboard.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emp_dashboard.setForeground(new java.awt.Color(228, 235, 251));
        emp_dashboard.setText("Dashboard");
        emp_dashboard.setBorder(null);
        emp_dashboard.setBorderPainted(false);
        emp_dashboard.setContentAreaFilled(false);
        emp_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_dashboard.addActionListener(this::emp_dashboardActionPerformed);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N

        emp_profile.setBackground(new java.awt.Color(31, 42, 64));
        emp_profile.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emp_profile.setForeground(new java.awt.Color(228, 235, 251));
        emp_profile.setText("My Profile");
        emp_profile.setBorder(null);
        emp_profile.setBorderPainted(false);
        emp_profile.setContentAreaFilled(false);
        emp_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_profile.setFocusPainted(false);
        emp_profile.setOpaque(true);
        emp_profile.addActionListener(this::emp_profileActionPerformed);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile.png"))); // NOI18N
        jLabel15.setToolTipText("");

        empPayrollDetails.setBackground(new java.awt.Color(31, 42, 64));
        empPayrollDetails.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        empPayrollDetails.setForeground(new java.awt.Color(228, 235, 251));
        empPayrollDetails.setText("Payroll Details");
        empPayrollDetails.setBorder(null);
        empPayrollDetails.setBorderPainted(false);
        empPayrollDetails.setContentAreaFilled(false);
        empPayrollDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empPayrollDetails.setFocusPainted(false);
        empPayrollDetails.setOpaque(true);
        empPayrollDetails.addActionListener(this::empPayrollDetailsActionPerformed);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emp_profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emp_dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(empPayrollDetails))
                .addGap(99, 99, 99))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel17))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnChangePassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emp_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(emp_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(empPayrollDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnChangePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(244, 246, 248));
        jPanel2.setForeground(new java.awt.Color(244, 246, 248));

        jPanel1.setBackground(new java.awt.Color(219, 233, 244));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Employee ID:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Position:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Department:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Employee Status:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Date Hired:");

        lblEmployeeID.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(0, 0, 0));
        lblEmployeeID.setText("2024-0001");

        lblName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Noah Pascua");

        lblPosition.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(0, 0, 0));
        lblPosition.setText("Software Engineer");

        lblDepartment.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartment.setText("IT Department");

        lblStatus.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 0, 0));
        lblStatus.setText("Regular");

        lblDateHired.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDateHired.setForeground(new java.awt.Color(0, 0, 0));
        lblDateHired.setText("January 01, 2026");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/id.png"))); // NOI18N

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/briefcase.png"))); // NOI18N

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/building.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/stats.png"))); // NOI18N

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21))
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblEmployeeID)
                    .addComponent(lblPosition)
                    .addComponent(lblDepartment)
                    .addComponent(lblStatus)
                    .addComponent(lblDateHired))
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmployeeID)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblPosition)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblDepartment)
                        .addComponent(jLabel19)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus)
                    .addComponent(jLabel23))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblDateHired)
                    .addComponent(jLabel22))
                .addGap(50, 50, 50))
        );

        welcome_ui.setBackground(new java.awt.Color(219, 233, 244));

        welcome_title.setBackground(new java.awt.Color(0, 0, 0));
        welcome_title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        welcome_title.setForeground(new java.awt.Color(0, 0, 0));
        welcome_title.setText("My Profile");

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

        welcome_title1.setBackground(new java.awt.Color(0, 0, 0));
        welcome_title1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        welcome_title1.setForeground(new java.awt.Color(0, 0, 0));
        welcome_title1.setText("Employee Information:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome_ui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome_title1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(welcome_ui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(welcome_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emp_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_dashboardActionPerformed
        emp_dashboard dashboard = new emp_dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_emp_dashboardActionPerformed

    private void emp_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_profileActionPerformed
        emp_profile profile = new emp_profile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_emp_profileActionPerformed

    private void empPayrollDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPayrollDetailsActionPerformed
        emp_payroll_details details = new emp_payroll_details();
        details.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empPayrollDetailsActionPerformed

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

        java.awt.EventQueue.invokeLater(() -> new emp_profile().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton empPayrollDetails;
    private javax.swing.JButton emp_dashboard;
    private javax.swing.JButton emp_profile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDateHired;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel welcome_subtitle;
    private javax.swing.JLabel welcome_title;
    private javax.swing.JLabel welcome_title1;
    private javax.swing.JPanel welcome_ui;
    // End of variables declaration//GEN-END:variables
}
