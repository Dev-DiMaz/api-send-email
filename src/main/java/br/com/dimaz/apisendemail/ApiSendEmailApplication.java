package br.com.dimaz.apisendemail;

import java.time.LocalDateTime;

import org.json.JSONObject;
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
	public String startPageApi() throws Exception {

		JSONObject jObj = new JSONObject();
		jObj.put("api", "Api-Send-Email");
		jObj.put("status", "On");
		jObj.put("time", LocalDateTime.now());
		jObj.put("by", "DiMaz");

//		return "{\"api\":\"Api-Send-Email is on!\", \"by\":\"DiMaz\"}";
		return jObj.toString();
	}
}
