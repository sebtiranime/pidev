package edu.workshopjdbc3a48.entities;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


public class EmailSender {
    public static void sendEmail(String recipientEmail) {
        final String username = "your-email@example.com";
        final String password = "your-email-password";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(recipientEmail));
            message.setSubject("Your item has been added to favorites");
            message.setText("Hi,\n\nYour item has been added to favorites!");

            Transport.send(message);

            System.out.println("Email sent successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
