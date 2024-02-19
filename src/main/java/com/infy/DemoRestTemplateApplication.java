package com.infy;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.infy.dto.CustomerDTO;

@SpringBootApplication
public class DemoRestTemplateApplication {
   private static final Log LOGGER =
		   LogFactory.getLog(DemoRestTemplateApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoRestTemplateApplication.class, args);
	}
	public void run(String... args) throws Exception {
		getCustomerDetails(2);
	}

	public void getCustomerDetails(Integer customerId) {
		String url = "http://localhost:8765/infybank/customers/{customerId}";
		RestTemplate restTemplate = new RestTemplate();
		CustomerDTO customerDTO = restTemplate.getForObject(url, CustomerDTO.class, customerId);
		LOGGER.info(customerDTO);
		LOGGER.info("\n");
	}
}
