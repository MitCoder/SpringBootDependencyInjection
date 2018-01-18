package com.spring.dependency.mail;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
/* If there are more than one classes which are annonated with @Component of same type, you can include @Primary.
 * If the class is annotated @Primary, then that particular class takes precedence and its associated object instantiation is saved in application context.
 * Once can also you @Qualifier with value. For example @Qualifier(value = "mailSmtp"), you can refer it in controller to inject the bean.
 * By default the Qualifier value is the name of the class in camelcase.
 */
@Component
//@Qualifier(value = "mailSmtp")
public class MailSmtpSender implements MailSender{
	private static Logger log = LoggerFactory.getLogger(MailSmtpSender.class);
	
	@Override
	public String send(String to, String subject, String emailBody) {
		log.info("Mail Sent via MailSmtpSender to "+to);
		log.info("with subject "+ subject);
		log.info("with emailBody "+ emailBody);
		
		return "Mail Sent via SMTP MailSmtpSender";
	}
	

}
