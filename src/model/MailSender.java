package model;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;


public class MailSender {
    
    private static final String SENDER_EMAIL = "payrollmngmnt00@gmail.com";
    private static final String SENDER_PASSWORD = "zngfjdzajgbtihbf";

    public static void sendTempPassword(String recipientEmail, String tempPassword) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");


        javax.mail.Session session = javax.mail.Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SENDER_EMAIL, SENDER_PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(SENDER_EMAIL));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Payroll System - Temporary Password");
            message.setText(
                "Hello,\n\n" +
                "You requested a password reset for your Payroll System account.\n\n" +
                "Your temporary password is: " + tempPassword + "\n\n" +
                "Please log in and change your password immediately.\n\n" +
                "If you did not request this, please contact your administrator."
            );
            Transport.send(message);
        } catch (Exception e) {
            throw new RuntimeException("Failed to send email: " + e.getMessage());
        }
    }
}
