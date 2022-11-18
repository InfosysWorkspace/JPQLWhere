package com.infy.JPQLWhere;

import com.infy.JPQLWhere.dto.CustomerDTO;
import com.infy.JPQLWhere.service.CustomerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.List;

@SpringBootApplication
public class JpqlWhereApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(JpqlWhereApplication.class);

	@Autowired
	CustomerService service;

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(JpqlWhereApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		getCustomerDetails();
	}

	public void getCustomerDetails(){
		try {
			List<CustomerDTO> customerDTOs = service.getCustomerDetails(1001);
			for(CustomerDTO customerDTO : customerDTOs){
				LOGGER.info(customerDTO);
			}
		} catch (Exception e){
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");
			LOGGER.info(message);
		}
	}
}
