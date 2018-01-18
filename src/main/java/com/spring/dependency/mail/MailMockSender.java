package com.spring.dependency.mail;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class MailMockSender implements MailSender{
	private static Logger log = LoggerFactory.getLogger(MailMockSender.class);
	
	@Override
	public String send(String to, String subject, String emailBody) {
		log.info("Sending mail via mailMockSender to "+ to);
		log.info("with subject "+ subject);
		log.info("with emailBody "+ emailBody);
		
		return "Mail Sent via mailMockSender";
	}
	

}
