package com.sharath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Microservice2Application {

	@RequestMapping("/name")
	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
		RestTemplate aarti = new RestTemplate();
		Resturant r = aarti.getForObject("http://localhost:8080/bill", Resturant.class);
		System.out.println(r.getBill()+" "+r.getName());
		
	}
}
