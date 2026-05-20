package com.sulabh.SpringJDBCDemo;

import com.sulabh.SpringJDBCDemo.model.Alien;
import com.sulabh.SpringJDBCDemo.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		// SpringApplication.run() creates and returns an object of a class
		// that implements ApplicationContext.

		// The Spring container is called ApplicationContext.

		Alien alien1 = context.getBean(Alien.class);
		alien1.setName("Sulabh");
		alien1.setId(1);
		alien1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findAll());
	}
}
