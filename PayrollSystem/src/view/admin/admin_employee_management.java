package view.admin;
import controller.EmployeeController;
import model.Session;
import javax.swing.JOptionPane;


public class admin_employee_management extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(admin_employee_management.class.getName());

  
    public admin_employee_management() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);    
    }
    
    private void clearFields() {
        txtEmployeeID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPassword.setText("");
        txtPosition.setText("");
        txtDepartment.setText("");
        txtSalary.setText("");
        txtDateHired.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        sidebar = new javax.swing.JPanel();
        sidebar_logo = new javax.swing.JLabel();
        dashboard_button = new javax.swing.JButton();
        dashboard_icon = new javax.swing.JLabel();
        emp_mgmt_button = new javax.swing.JButton();
        emp_mgmt_icon = new javax.swing.JLabel();
        payroll_input_button = new javax.swing.JButton();
        payroll_input_icon = new javax.swing.JLabel();
        payroll_history_button = new javax.swing.JButton();
        payroll_history_icon = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDateHired = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtStatus = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 768));

        sidebar.setBackground(new java.awt.Color(31, 42, 64));

        sidebar_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/150x150.png"))); // NOI18N

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
        emp_mgmt_button.setOpaque(true);
        emp_mgmt_button.addActionListener(this::emp_mgmt_buttonActionPerformed);

        emp_mgmt_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        payroll_history_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/history.png"))); // NOI18N

        logout_button.setBackground(new java.awt.Color(63, 114, 175));
        logout_button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setText("Logout");
        logout_button.setBorder(null);
        logout_button.addActionListener(this::logout_buttonActionPerformed);

        jPanel2.setBackground(new java.awt.Color(244, 246, 248));

        jPanel3.setBackground(new java.awt.Color(219, 233, 244));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Employee Management");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(143, 143, 143));
        jLabel3.setText("Payroll Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 63, 63));
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(63, 63, 63));
        jLabel5.setText("Employee ID:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(63, 63, 63));
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(63, 63, 63));
        jLabel7.setText("Last Name:");

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtLastName.addActionListener(this::txtLastNameActionPerformed);

        txtDepartment.setBackground(new java.awt.Color(255, 255, 255));
        txtDepartment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDepartment.addActionListener(this::txtDepartmentActionPerformed);

        txtPosition.setBackground(new java.awt.Color(255, 255, 255));
        txtPosition.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPosition.addActionListener(this::txtPositionActionPerformed);

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtFirstName.addActionListener(this::txtFirstNameActionPerformed);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(63, 63, 63));
        jLabel8.setText("Employment Status:");

        txtEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(63, 63, 63));
        jLabel9.setText("Department: ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(63, 63, 63));
        jLabel10.setText("Basic Salary: ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(63, 63, 63));
        jLabel11.setText("Date Hired: ");

        txtDateHired.setBackground(new java.awt.Color(255, 255, 255));
        txtDateHired.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtSalary.setBackground(new java.awt.Color(255, 255, 255));
        txtSalary.setForeground(new java.awt.Color(0, 0, 0));
        txtSalary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSalary.addActionListener(this::txtSalaryActionPerformed);

        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        txtStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtStatus.addActionListener(this::txtStatusActionPerformed);

        btnUpdate.setBackground(new java.awt.Color(26, 75, 157));
        btnUpdate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("EDIT");
        btnUpdate.setBorder(null);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        jButton9.setBackground(new java.awt.Color(76, 83, 96));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("CLEAR");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAddEmployee.setBackground(new java.awt.Color(42, 140, 78));
        btnAddEmployee.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setText("ADD EMPLOYEE");
        btnAddEmployee.setBorder(null);
        btnAddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEmployee.addActionListener(this::btnAddEmployeeActionPerformed);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 63, 63));
        jLabel1.setText("Position:");

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName)
                            .addComponent(txtPosition)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtPassword))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(93, 93, 93)
                                    .addComponent(txtSalary))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDateHired))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(100, 100, 100)
                                .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDateHired, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(sidebarLayout.createSequentialGroup()
                            .addComponent(payroll_history_icon)
                            .addGap(6, 6, 6)
                            .addComponent(payroll_history_button))
                        .addGroup(sidebarLayout.createSequentialGroup()
                            .addComponent(emp_mgmt_icon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emp_mgmt_button))
                        .addGroup(sidebarLayout.createSequentialGroup()
                            .addComponent(payroll_input_icon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(payroll_input_button))
                        .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(dashboard_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboard_button)
                            .addComponent(sidebar_logo))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidebar_logo)
                .addGap(50, 50, 50)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard_icon))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emp_mgmt_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emp_mgmt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payroll_input_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payroll_input_icon))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payroll_history_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payroll_history_icon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        admin_update_employee update = new admin_update_employee(); 
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_buttonActionPerformed
        admin_dashboard dashboard = new admin_dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboard_buttonActionPerformed

    private void emp_mgmt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_mgmt_buttonActionPerformed
        admin_employee_management emp_management = new admin_employee_management();
        emp_management.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_emp_mgmt_buttonActionPerformed

    private void payroll_input_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_input_buttonActionPerformed
        admin_input_payroll input_payroll = new admin_input_payroll();
        input_payroll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_input_buttonActionPerformed

    private void payroll_history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_history_buttonActionPerformed
        admin_payroll_history payroll_history = new admin_payroll_history();
        payroll_history.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_history_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
       int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            Session.destroySession();
            admin_login adLogin = new admin_login();
            adLogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        EmployeeController controller = new EmployeeController();

            controller.insertEmployee(
                Integer.parseInt(txtEmployeeID.getText()),
                txtFirstName.getText(),
                txtLastName.getText(),
                txtPassword.getText(),
                txtPosition.getText(),
                txtDepartment.getText(),
                Double.parseDouble(txtSalary.getText()),
                txtDateHired.getText()
            );
            clearFields();
    }//GEN-LAST:event_btnAddEmployeeActionPerformed


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
        java.awt.EventQueue.invokeLater(() -> new admin_employee_management().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton dashboard_button;
    private javax.swing.JLabel dashboard_icon;
    private javax.swing.JButton emp_mgmt_button;
    private javax.swing.JLabel emp_mgmt_icon;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton payroll_history_button;
    private javax.swing.JLabel payroll_history_icon;
    private javax.swing.JButton payroll_input_button;
    private javax.swing.JLabel payroll_input_icon;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel sidebar_logo;
    private javax.swing.JTextField txtDateHired;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}
