package com.trancecoder;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.trancecoder.Repository.ContactRepo;
import com.trancecoder.dataobject.contactDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		ContactRepo conrepo = ctxt.getBean(ContactRepo.class);

		contactDetails condtls = new contactDetails();
		condtls.setClientNum("12345");
		condtls.setClientPhone(9874563210l);
		condtls.setClientAddress("Pune");
		conrepo.save(condtls);

	}

}
