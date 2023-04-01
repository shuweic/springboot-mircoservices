package net.UnitSC.empolyeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
// @EnableEurekaClient // we do not need this annotation for Spring 3
@EnableFeignClients
public class EmpolyeeServiceApplication {

	// define spring bean
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

//	@Bean
//	public WebClient webClient() {
//		return WebClient.builder().build();
//	}


	public static void main(String[] args) {
		SpringApplication.run(EmpolyeeServiceApplication.class, args);
	}

}
