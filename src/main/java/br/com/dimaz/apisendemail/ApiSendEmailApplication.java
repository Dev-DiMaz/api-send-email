package br.com.dimaz.apisendemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiSendEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSendEmailApplication.class, args);
	}
	@GetMapping
	@RequestMapping("/")
	public String startPageApi() {
		return "{\"api\":\"Api-Send-Email is on!\", \"by\":\"DiMaz\"}";
	}
}
