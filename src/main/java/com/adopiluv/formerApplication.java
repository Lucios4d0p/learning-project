package com.adopiluv;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class formerApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(formerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(formerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("declaración inicial, proceso de lectura");
	}
}

