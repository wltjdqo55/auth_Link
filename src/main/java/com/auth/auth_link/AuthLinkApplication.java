package com.auth.auth_link;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AuthLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthLinkApplication.class, args);
	}

}
