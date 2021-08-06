package br.com.dimaz.apisendemail.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	public ResponseEntity<?> sendMail(@RequestBody MailDTO mail) {
		service.validateAndSendMail(mail);
        return ResponseEntity.ok(new SuccessResponse("success"));
	}
}
