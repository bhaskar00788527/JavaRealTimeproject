package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {

	@Autowired
	private MailSender mailSender;
	
	public boolean sendEmail(String subject,String body,String to) {
		
		boolean isSent=false;
		try{
			
			MimeMessage mimeMsg=  ((JavaMailSender) mailSender).createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(mimeMsg);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body, true);
			mailSender.send();
			 isSent=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isSent;
	}
}
