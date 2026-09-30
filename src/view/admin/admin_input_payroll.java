
package view.admin;


import controller.EmployeeController;
import controller.PayrollController;
import model.Session;
import javax.swing.JOptionPane;
    
public class admin_input_payroll extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(admin_input_payroll.class.getName());

    public admin_input_payroll() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        lblBasicSalary.setText("0");
        lblPosition.setText("");
        loadEmployees();
        txtPayDate.setText(java.time.LocalDate.now().toString());
        setupDocumentListeners();
    }
    
     private void loadEmployees() {
        EmployeeController controller = new EmployeeController();
        cmbEmployee.setModel(controller.getActiveEmployeeComboModel());
    }
     
     private void setupDocumentListeners() {
        javax.swing.event.DocumentListener listener =
            new javax.swing.event.DocumentListener() {
                public void insertUpdate(javax.swing.event.DocumentEvent e) {
                    refreshDeductions();
                }
                public void removeUpdate(javax.swing.event.DocumentEvent e) {
                    refreshDeductions();
                }
                public void changedUpdate(javax.swing.event.DocumentEvent e) {
                    refreshDeductions();
                }
            };
        txtDaysWorked.getDocument().addDocumentListener(listener);
        txtOvertime.getDocument().addDocumentListener(listener);
        txtBonus.getDocument().addDocumentListener(listener);
    }
     
     private void refreshDeductions() {
        PayrollController controller = new PayrollController();
        String[] preview = controller.getDeductionPreview(
            lblBasicSalary.getText(),
            txtDaysWorked.getText(),
            txtOvertime.getText(),
            txtBonus.getText()
        );
        lblContributions.setText(preview[0]);
        txtDeduction.setText(preview[1]);
    }
     
     private void clearFields() {
        cmbEmployee.setSelectedIndex(0);
        txtDaysWorked.setText("");
        txtOvertime.setText("");
        txtBonus.setText("");
        txtDeduction.setText("0.00");
        lblContributions.setText(
            "SSS: 0.00 | PhilHealth: 0.00 | Pag-IBIG: 0.00 | Absent: 0.00");
        lblBasicSalary.setText("0");
        lblPosition.setText("");
    }
     
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDaysWorked = new javax.swing.JTextField();
        txtOvertime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBonus = new javax.swing.JTextField();
        txtDeduction = new javax.swing.JTextField();
        btnCreatePayroll = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPayDate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblBasicSalary = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblContributions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 768));

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
        dashboard_button.setMaximumSize(new java.awt.Dimension(188, 55));
        dashboard_button.setMinimumSize(new java.awt.Dimension(188, 55));
        dashboard_button.setOpaque(true);
        dashboard_button.setPreferredSize(new java.awt.Dimension(188, 55));
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
        emp_mgmt_button.setFocusPainted(false);
        emp_mgmt_button.setMaximumSize(new java.awt.Dimension(188, 55));
        emp_mgmt_button.setMinimumSize(new java.awt.Dimension(188, 55));
        emp_mgmt_button.setOpaque(true);
        emp_mgmt_button.setPreferredSize(new java.awt.Dimension(188, 55));
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
        payroll_input_button.setMaximumSize(new java.awt.Dimension(188, 55));
        payroll_input_button.setMinimumSize(new java.awt.Dimension(188, 55));
        payroll_input_button.setOpaque(true);
        payroll_input_button.setPreferredSize(new java.awt.Dimension(188, 55));
        payroll_input_button.addActionListener(this::payroll_input_buttonActionPerformed);

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
        payroll_history_button.setMaximumSize(new java.awt.Dimension(188, 55));
        payroll_history_button.setMinimumSize(new java.awt.Dimension(188, 55));
        payroll_history_button.setOpaque(true);
        payroll_history_button.setPreferredSize(new java.awt.Dimension(188, 55));
        payroll_history_button.addActionListener(this::payroll_history_buttonActionPerformed);

        payroll_history_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payroll_history_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/history.png"))); // NOI18N

        logout_button.setBackground(new java.awt.Color(63, 114, 175));
        logout_button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setText("Logout");
        logout_button.setBorder(null);
        logout_button.setPreferredSize(new java.awt.Dimension(88, 55));
        logout_button.addActionListener(this::logout_buttonActionPerformed);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/150x150.png"))); // NOI18N

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sidebarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payroll_history_icon)
                            .addComponent(emp_mgmt_icon)
                            .addComponent(dashboard_icon)
                            .addComponent(payroll_input_icon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_mgmt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payroll_input_button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payroll_history_button, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(dashboard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(50, 50, 50)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard_icon))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emp_mgmt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(emp_mgmt_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payroll_input_button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(payroll_input_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payroll_history_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payroll_history_button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(244, 246, 248));

        jPanel3.setBackground(new java.awt.Color(219, 233, 244));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Input Payroll");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(143, 143, 143));
        jLabel6.setText("Payroll Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 63, 63));
        jLabel1.setText("Select Employee:");
        jLabel1.setMaximumSize(new java.awt.Dimension(188, 55));
        jLabel1.setMinimumSize(new java.awt.Dimension(188, 55));
        jLabel1.setPreferredSize(new java.awt.Dimension(188, 55));

        cmbEmployee.setBackground(new java.awt.Color(255, 255, 255));
        cmbEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEmployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cmbEmployee.addActionListener(this::cmbEmployeeActionPerformed);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 63, 63));
        jLabel2.setText("Deduction:");
        jLabel2.setMaximumSize(new java.awt.Dimension(188, 55));
        jLabel2.setMinimumSize(new java.awt.Dimension(188, 55));
        jLabel2.setPreferredSize(new java.awt.Dimension(188, 55));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 63, 63));
        jLabel3.setText("Overtime Hours:");
        jLabel3.setMaximumSize(new java.awt.Dimension(188, 55));
        jLabel3.setMinimumSize(new java.awt.Dimension(188, 55));
        jLabel3.setPreferredSize(new java.awt.Dimension(188, 55));

        txtDaysWorked.setBackground(new java.awt.Color(255, 255, 255));
        txtDaysWorked.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDaysWorked.addActionListener(this::txtDaysWorkedActionPerformed);

        txtOvertime.setBackground(new java.awt.Color(255, 255, 255));
        txtOvertime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtOvertime.addActionListener(this::txtOvertimeActionPerformed);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 63, 63));
        jLabel4.setText("Days Worked:");
        jLabel4.setMaximumSize(new java.awt.Dimension(188, 55));
        jLabel4.setMinimumSize(new java.awt.Dimension(188, 55));
        jLabel4.setPreferredSize(new java.awt.Dimension(188, 55));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(63, 63, 63));
        jLabel7.setText("Bonus:");
        jLabel7.setMaximumSize(new java.awt.Dimension(188, 55));
        jLabel7.setMinimumSize(new java.awt.Dimension(188, 55));
        jLabel7.setPreferredSize(new java.awt.Dimension(188, 55));

        txtBonus.setBackground(new java.awt.Color(255, 255, 255));
        txtBonus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtDeduction.setBackground(new java.awt.Color(255, 255, 255));
        txtDeduction.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnCreatePayroll.setBackground(new java.awt.Color(63, 114, 175));
        btnCreatePayroll.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnCreatePayroll.setForeground(new java.awt.Color(255, 255, 255));
        btnCreatePayroll.setText("GENERATE PAYROLL");
        btnCreatePayroll.setBorder(null);
        btnCreatePayroll.addActionListener(this::btnCreatePayrollActionPerformed);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CLEAR");
        jButton7.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(63, 63, 63));
        jLabel13.setText("Date:");

        txtPayDate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtPayDate.setForeground(new java.awt.Color(63, 63, 63));
        txtPayDate.setText("03-12-26");

        jPanel1.setBackground(new java.awt.Color(167, 205, 235));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(63, 63, 63));
        jLabel11.setText("Position:");

        lblPosition.setBackground(new java.awt.Color(0, 0, 0));
        lblPosition.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(63, 63, 63));
        lblPosition.setText("Sample Position");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(63, 63, 63));
        jLabel9.setText("Basic Salary:");

        lblBasicSalary.setBackground(new java.awt.Color(0, 0, 0));
        lblBasicSalary.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblBasicSalary.setForeground(new java.awt.Color(63, 63, 63));
        lblBasicSalary.setText("20000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lblPosition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblBasicSalary))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBasicSalary)
                    .addComponent(lblPosition))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(167, 205, 235));
        jPanel5.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(63, 63, 63));
        jLabel14.setText("Contributions & Deductions");

        lblContributions.setBackground(new java.awt.Color(0, 0, 0));
        lblContributions.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblContributions.setForeground(new java.awt.Color(63, 63, 63));
        lblContributions.setText("SSS: 0 | PhilHealth: 0 | Pag-IBIG: 0 | Absent: 0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(82, 82, 82))
            .addComponent(lblContributions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContributions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPayDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreatePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDaysWorked)
                                    .addComponent(txtOvertime)
                                    .addComponent(cmbEmployee, 0, 200, Short.MAX_VALUE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDaysWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreatePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPayDate))
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtOvertimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOvertimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOvertimeActionPerformed

    private void emp_mgmt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_mgmt_buttonActionPerformed
        admin_employee_management emp_management = new admin_employee_management();
        emp_management.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_emp_mgmt_buttonActionPerformed

    private void payroll_history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_history_buttonActionPerformed
        admin_payroll_history payroll_history = new admin_payroll_history();
        payroll_history.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_history_buttonActionPerformed

    private void payroll_input_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payroll_input_buttonActionPerformed
        admin_input_payroll input_payroll = new admin_input_payroll();
        input_payroll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payroll_input_buttonActionPerformed

    private void dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_buttonActionPerformed
        admin_dashboard dashboard = new admin_dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboard_buttonActionPerformed

    private void cmbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeActionPerformed
        EmployeeController controller = new EmployeeController();
        String[] info = controller.getEmployeeDisplayInfo(
                cmbEmployee.getSelectedItem());
        if (info != null) {
            lblPosition.setText(info[0]);
            lblBasicSalary.setText(info[1]);
            refreshDeductions();
        }
    }//GEN-LAST:event_cmbEmployeeActionPerformed

    private void txtDaysWorkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDaysWorkedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDaysWorkedActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
         int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            Session.destroySession();
            admin_login adLogin = new admin_login();
            adLogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void btnCreatePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePayrollActionPerformed
        EmployeeController empController = new EmployeeController();
        int employeeID = empController.parseEmployeeIDFromSelection(
                cmbEmployee.getSelectedItem());

        PayrollController controller = new PayrollController();
        String error = controller.insertPayroll(
            String.valueOf(employeeID),
            txtDaysWorked.getText(),
            txtOvertime.getText(),
            txtBonus.getText(),
            lblBasicSalary.getText()
        );
        if (error == null) {
            JOptionPane.showMessageDialog(this, "Payroll generated successfully!");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, error);
        }
    }//GEN-LAST:event_btnCreatePayrollActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new admin_input_payroll().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePayroll;
    private javax.swing.JComboBox<String> cmbEmployee;
    private javax.swing.JButton dashboard_button;
    private javax.swing.JLabel dashboard_icon;
    private javax.swing.JButton emp_mgmt_button;
    private javax.swing.JLabel emp_mgmt_icon;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBasicSalary;
    private javax.swing.JLabel lblBasicSalary1;
    private javax.swing.JLabel lblContributions;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPosition1;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton payroll_history_button;
    private javax.swing.JLabel payroll_history_icon;
    private javax.swing.JButton payroll_input_button;
    private javax.swing.JLabel payroll_input_icon;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtDaysWorked;
    private javax.swing.JTextField txtDeduction;
    private javax.swing.JTextField txtOvertime;
    private javax.swing.JLabel txtPayDate;
    // End of variables declaration//GEN-END:variables

}
