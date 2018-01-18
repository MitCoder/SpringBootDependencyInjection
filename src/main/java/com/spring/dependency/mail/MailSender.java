package com.spring.dependency.mail;

public interface MailSender {
	public String send(String to, String subject, String emailBody);

}
