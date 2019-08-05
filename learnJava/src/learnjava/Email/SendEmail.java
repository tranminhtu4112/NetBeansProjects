/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Email;

/**
 *
 * @author Pass
 */
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import com.sun.xml.internal.ws.wsdl.writer.document.Message;
import java.util.*;
import sun.rmi.transport.Transport;

public class SendEmail
{
   public static void main(String [] args)
   {    
      // Email ID cua nguoi nhan can duoc de cap den.
      String to = "abcd@gmail.com";

      // Email ID cua nguoi gui can duoc de cap den
      String from = "web@gmail.com";

      // Gia su ban dang gui email tu localhost
      String host = "localhost";

      // Lay cac system properties
      Properties properties = System.getProperties();

      // Thiet lap mail server
      properties.setProperty("mail.smtp.host", host);

      // Lay doi tuong Session mac dinh.
      Session session = Session.getDefaultInstance(properties);

      try{
         // Tao mot doi tuong MimeMessage mac dinh.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field.
         message.setFrom(new InternetAddress(from));

         // Set To: header field.
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Day la dong Subject!");

         // Bay gio thiet lap message thuc su
         message.setText("Day la message thuc su");

         // Send message
         Transport.send(message);
         System.out.println("Gui message thanh cong....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}