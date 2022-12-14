package com.codewithdurgesh.blog;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableCaching
public class BlogAppApiApplication implements CommandLineRunner{
 
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BlogAppApiApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
		
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(this.passwordEncoder.encode("abc"));
	}
	
	public static void main1(String[] args) {
		SpringApplication.run(BlogAppApiApplication.class, args);
	}
	public static void main2(String[] args) {
		SpringApplication.run(BlogAppApiApplication.class, args);
	}
	public static void main3(String[] args) {
		SpringApplication.run(BlogAppApiApplication.class, args);
	}
	
	public static void main5(String[] args) {
		
	}
	
public static void main6(String[] args) {
		
	}
}

