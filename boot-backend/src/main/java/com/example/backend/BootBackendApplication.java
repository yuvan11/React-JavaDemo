package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;

@SpringBootApplication
public class BootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Yuvaraj","R","yuva@gmail.com"));
		this.userRepository.save(new User("Naveev","R","naveen@gmail.com"));

		
		
		
	}

}
