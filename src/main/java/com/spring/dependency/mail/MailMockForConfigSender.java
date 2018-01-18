package com.spring.dependency.mail;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * this class doesnt have a @Component bean, but you can create a configuration bean to instantiate the object and put the bean in application content.
 * If there are jars that have services which do not have @Component, then you can create your own @Configuration bean
 *
 */
public class MailMockForConfigSender implements MailSender {
	private static Logger log = LoggerFactory.getLogger(MailMockForConfigSender.class);
	
	@Override
	public String send(String to, String subject, String emailBody) {
		log.info("Sending mail via MailMockForConfigSenderto "+ to);
		log.info("with subject "+ subject);
		log.info("with emailBody "+ emailBody);
		
		return "Mail Sent via MailMockForConfigSender";
	}
	

}
