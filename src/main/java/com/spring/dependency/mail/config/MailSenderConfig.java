package com.spring.dependency.mail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.dependency.mail.MailMockForConfigSender;
import com.spring.dependency.mail.MailSender;

@Configuration
public class MailSenderConfig {

	@Bean
	public MailSender mailMockForConfigSender() {
		
		return new MailMockForConfigSender();
	}
}
