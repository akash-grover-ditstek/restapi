
package com.demo.restapi;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class RestapiApplication {
	//static final private String sendGridApi = "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";

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RestapiApplication.class, args);
		System.out.println("hello");
//		Email from = new Email("harsh.sindhwani@ditstek.com");
//		Email to = new Email("testApi@yopmail.com"); // use your own email address here
//		String subject = "This is test subject";
//		Content content = new Content("text/html", "<strong>Test Content</strong>");
//		System.out.println(content);
//		Mail mail = new Mail(from, subject, to, content);
//		System.out.println("mail:"+mail);
//		SendGrid sg = new SendGrid(sendGridApi);
//		System.out.println(sg);
//		Request request = new Request();
//
//		request.setMethod(Method.POST);
//		request.setEndpoint("mail/send");
//		request.setBody(mail.build());
//
//		Response response = sg.api(request);
//
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getHeaders());
//		System.out.println(response.getBody());
	}

}
