/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

import java.util.Properties;
import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Pedro
 */
public class Mail {

    private static final String SMTP_HOST_NAME = "mail.elfrentecr.org"; //or simply "localhost"
    private static final String SMTP_AUTH_USER = "info@elfrentecr.org";
    private static final String SMTP_AUTH_PWD = "INFOINFO";
    private static final String emailFromAddress = "info@elfrentecr.org";
    // Recipient's email ID needs to be mentioned.
    String to;
    // Sender's email ID needs to be mentioned
    String from;
    // Assuming you are sending email from localhost
    String host;
   

// smtpMailSender.postMail( emailList, emailSubjectTxt, emailMsgTxt, emailFromAddress); 
//     System.out.println("Sucessfully Sent mail to All Users");
    public void postMail(String[] recipients, String subject, String message, String from)
            throws MessagingException, AuthenticationFailedException {
        boolean debug = false; //Set the host smtp address
        
      
        
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.port", "2525");
        props.put("mail.smtp.auth", "true");
        Authenticator auth = new SMTPAuthenticator();
        Session session = Session.getDefaultInstance(props, auth);
        session.setDebug(debug); // create a message 
        Message msg = new MimeMessage(session); // set the from and to address 
        InternetAddress addressFrom = new InternetAddress(from);
        msg.setFrom(addressFrom);
     
        InternetAddress[] addressTo = new InternetAddress[recipients.length];
        for ( int i = 0; i < recipients.length; i++ ) {
            
            addressTo[i] = new InternetAddress(recipients[i]);
            
        }
        
        msg.setRecipients(Message.RecipientType.TO, addressTo); // Setting the Subject and Content Type 
        msg.setSubject(subject);
        msg.setContent(message, "text/plain");
        Transport.send(msg);
    }

    private class SMTPAuthenticator extends javax.mail.Authenticator {

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            String username = SMTP_AUTH_USER;
            String password = SMTP_AUTH_PWD;
            return new PasswordAuthentication(username, password);
        }
    }

    public Mail(String to, String from, String host) {

        this.to = to;
        this.from = from;
        this.host = host;
    }

    public void enviar( String to, String emailMsgTxt, String emailSubjectTxt) throws MessagingException {
       String[] emailList = {to};
        
        postMail( emailList, emailSubjectTxt, emailMsgTxt, emailFromAddress); 


    }


}
