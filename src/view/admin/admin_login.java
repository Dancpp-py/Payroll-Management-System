
package view.admin;
import controller.AdminLoginController;
import javax.swing.JOptionPane;
import view.employee.emp_login;

public class admin_login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(admin_login.class.getName());


    public admin_login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtAdminUsername = new javax.swing.JTextField();
        txtAdminPassword = new javax.swing.JPasswordField();
        btnAdminLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLoginAsEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setBackground(new java.awt.Color(244, 246, 248));
        main_panel.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(31, 42, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        txtAdminUsername.setBackground(new java.awt.Color(240, 239, 255));
        txtAdminUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAdminUsername.setForeground(new java.awt.Color(104, 104, 104));
        txtAdminUsername.setMargin(new java.awt.Insets(2, 20, 6, 6));
        txtAdminUsername.addActionListener(this::txtAdminUsernameActionPerformed);

        txtAdminPassword.setBackground(new java.awt.Color(240, 239, 255));
        txtAdminPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAdminPassword.setForeground(new java.awt.Color(104, 104, 104));
        txtAdminPassword.setToolTipText("");
        txtAdminPassword.setMargin(new java.awt.Insets(2, 20, 2, 6));
        txtAdminPassword.addActionListener(this::txtAdminPasswordActionPerformed);

        btnAdminLogin.setBackground(new java.awt.Color(63, 114, 175));
        btnAdminLogin.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminLogin.setText("Login");
        btnAdminLogin.addActionListener(this::btnAdminLoginActionPerformed);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/256x256.png"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(206, 206, 206));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMIN LOGIN");

        btnLoginAsEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginAsEmployee.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnLoginAsEmployee.setForeground(new java.awt.Color(206, 206, 206));
        btnLoginAsEmployee.setText("Login as Employee");
        btnLoginAsEmployee.setBorder(null);
        btnLoginAsEmployee.setBorderPainted(false);
        btnLoginAsEmployee.setContentAreaFilled(false);
        btnLoginAsEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginAsEmployee.addActionListener(this::btnLoginAsEmployeeActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(txtAdminPassword)
                            .addComponent(btnAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(btnLoginAsEmployee)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginAsEmployee)
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void txtAdminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminUsernameActionPerformed

    private void btnLoginAsEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAsEmployeeActionPerformed
        emp_login emp = new emp_login();
        emp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginAsEmployeeActionPerformed

    private void txtAdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminPasswordActionPerformed

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        AdminLoginController controller = new AdminLoginController();
        String error = controller.login(
            txtAdminUsername.getText(),
            new String(txtAdminPassword.getPassword())
        );
        if (error == null) {
            new admin_dashboard().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, error);
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new admin_login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnLoginAsEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPasswordField txtAdminPassword;
    private javax.swing.JTextField txtAdminUsername;
    // End of variables declaration//GEN-END:variables
}
