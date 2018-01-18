package com.spring.dependency.controller.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.dependency.mail.MailSender;


@RestController
public class MailController{
	
	/*Using interface MailSender, but we are instansiating with concrete class. So we are using another class of Type MailSender then the below will not work.
	@Autowired
	private MailSender mailSender = new MailMockSender();
	
	*/
	/*To address the issue with dependency injection. We can have @Component annotation to MailMockSender. When the application runs, it looks for meta information such as @RestController and @Component.
	 * When it sees a class with @RestController, @Component,@Controller,@Service, @Repository and @SpringBootApplication, it instantiates the class and creates an object which is put in application context.
	 * The objects are also created for class with @RestController. If the variable in Controller class is annotated with @Autowire, it will look for associated object in application context and inject the refrence.
	 *  
	 */
	
	private MailSender mailSender;
	
	/*public MailController (@Qualifier("mailMockForConfigSender") MailSender mailSender) {
		this.mailSender = mailSender;		
	}
	*/
	public MailController (MailSender mailMockSender) {
		this.mailSender = mailMockSender;		
	}
	
	@RequestMapping("/mail")
	public String send() {
		return mailSender.send("Somebody.com","test email","This is test email body");
	}

	
}
