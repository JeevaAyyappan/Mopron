package lib;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendReportMail {

		    public static void sendMail() {
	        // Email configuration
	        String host = "mail.cml03.net";
	        String port = "1025";
	        String username = "support@cml03.net";
	        String password = "support12345";

	        // Recipient email
	        String toEmail = "d.prabhakaran@cmlmediasoft.com";

	        // Create properties
	        Properties props = new Properties();
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", port);
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");

	        // Create session
	        Session session = Session.getInstance(props, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });

	        try {
	            // Create message
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(username));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
	            message.setSubject("Extent Report");

	            // Create multipart message
	            Multipart multipart = new MimeMultipart();
	            BodyPart messageBodyPart = new MimeBodyPart();
	            messageBodyPart.setText("Please find the attached Extent Report.");
	            multipart.addBodyPart(messageBodyPart);

	            // Attach Extent Report HTML file
	            messageBodyPart = new MimeBodyPart();
	            String reportPath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\Get5StarReviews\\SocialUser.json";
	            FileDataSource source = new FileDataSource(reportPath);
	            messageBodyPart.setDataHandler(new DataHandler(source));
	            messageBodyPart.setFileName("ExtentReport.html");
	            multipart.addBodyPart(messageBodyPart);

	            // Set content of the message
	            message.setContent(multipart);

	            // Send the message
	            Transport.send(message);

	            System.out.println("Email sent successfully.");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
	    }
	

	
	
}
