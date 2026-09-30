
package view.employee;

import controller.EmployeeLoginController;
import javax.swing.JOptionPane;
import view.admin.admin_login;
public class emp_login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(emp_login.class.getName());

    public emp_login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtEmpUsername = new javax.swing.JTextField();
        txtEmpPassword = new javax.swing.JPasswordField();
        btnEmpLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLoginAsAdmin = new javax.swing.JButton();
        btnEmpForgotPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setBackground(new java.awt.Color(244, 246, 248));
        main_panel.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(31, 42, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        txtEmpUsername.setBackground(new java.awt.Color(240, 239, 255));
        txtEmpUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpUsername.setForeground(new java.awt.Color(104, 104, 104));
        txtEmpUsername.setMargin(new java.awt.Insets(2, 20, 6, 6));
        txtEmpUsername.addActionListener(this::txtEmpUsernameActionPerformed);

        txtEmpPassword.setBackground(new java.awt.Color(240, 239, 255));
        txtEmpPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpPassword.setForeground(new java.awt.Color(104, 104, 104));
        txtEmpPassword.setMargin(new java.awt.Insets(2, 20, 2, 6));

        btnEmpLogin.setBackground(new java.awt.Color(63, 114, 175));
        btnEmpLogin.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnEmpLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpLogin.setText("Login");
        btnEmpLogin.addActionListener(this::btnEmpLoginActionPerformed);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/256x256.png"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(206, 206, 206));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE LOGIN");

        btnLoginAsAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginAsAdmin.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnLoginAsAdmin.setForeground(new java.awt.Color(206, 206, 206));
        btnLoginAsAdmin.setText("Login as Admin");
        btnLoginAsAdmin.setBorder(null);
        btnLoginAsAdmin.setBorderPainted(false);
        btnLoginAsAdmin.setContentAreaFilled(false);
        btnLoginAsAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginAsAdmin.addActionListener(this::btnLoginAsAdminActionPerformed);

        btnEmpForgotPassword.setText("Forgot Password");
        btnEmpForgotPassword.addActionListener(this::btnEmpForgotPasswordActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 303, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(297, 297, 297))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnEmpForgotPassword)
                        .addGap(58, 58, 58)
                        .addComponent(btnLoginAsAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(txtEmpPassword)
                            .addComponent(btnEmpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtEmpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtEmpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEmpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginAsAdmin)
                    .addComponent(btnEmpForgotPassword))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        main_panel.add(jPanel1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpUsernameActionPerformed

    private void btnLoginAsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAsAdminActionPerformed
        admin_login admin = new admin_login();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginAsAdminActionPerformed

    private void btnEmpLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpLoginActionPerformed
        EmployeeLoginController controller = new EmployeeLoginController();
        String error = controller.login(
            txtEmpUsername.getText(),
            new String(txtEmpPassword.getPassword())
        );
        if (error == null) {
            new emp_dashboard().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, error);
        }
    }//GEN-LAST:event_btnEmpLoginActionPerformed

    private void btnEmpForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpForgotPasswordActionPerformed
        emp_forgot_password forgot = new emp_forgot_password();
        forgot.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmpForgotPasswordActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new emp_login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpForgotPassword;
    private javax.swing.JButton btnEmpLogin;
    private javax.swing.JButton btnLoginAsAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPasswordField txtEmpPassword;
    private javax.swing.JTextField txtEmpUsername;
    // End of variables declaration//GEN-END:variables
}
