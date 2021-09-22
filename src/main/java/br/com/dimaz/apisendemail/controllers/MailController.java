package br.com.dimaz.apisendemail.controllers;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.simpleemail.model.MessageRejectedException;

import br.com.dimaz.apisendemail.domain.dtos.MailDTO;
import br.com.dimaz.apisendemail.domain.response.SuccessResponse;
import br.com.dimaz.apisendemail.services.MailService;

@RestController
@RequestMapping("/api/v1/emails")
public class MailController {

	private MailService service;
	
	public MailController(MailService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<?> sendMail(@RequestBody MailDTO mail) throws MessagingException, MessageRejectedException, UnsupportedEncodingException {
		service.validateAndSendMail(mail);
        return ResponseEntity.ok(new SuccessResponse("success"));
	}
}
