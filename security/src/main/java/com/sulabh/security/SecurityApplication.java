package com.sulabh.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}


//Client request
//      ↓
//Spring Security Filter Chain (having mulitple filters)
//      ↓
//Check token/session/login
//      ↓
//Authenticate user
//      ↓
//Check roles/permissions
//      ↓
//Controller method


// CSRF : cross site request forgery : it means some other person
// or website making request by your behalf, they take your
// session id and request on your behalf to still the data
// and this is called and csrf.

// also when we do update delte add into the data then we have to send the csrf token also.