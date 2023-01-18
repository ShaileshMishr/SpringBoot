package com.training.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.training.springboot.model.Address;
import com.training.springboot.model.Book;
import com.training.springboot.model.Page;
import com.training.springboot.model.User;
import com.training.springboot.repository.AddressRepository;
import com.training.springboot.repository.BookRepository;
import com.training.springboot.repository.PageRepository;
import com.training.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Bean
	public CommandLineRunner oneToManyDemo(BookRepository bookRepo, PageRepository pageRepo) {
		
		return args ->{
	
			Book book = new Book("JAVA","Bates");
			bookRepo.save(book);
			
			pageRepo.save(new Page(1,"Introduction",book));
			pageRepo.save(new Page(34,"Collection",book));
			pageRepo.save(new Page(101,"Spring",book));
			pageRepo.save(new Page(167,"Microservices",book));
		};
	}
	
	
	/*
	@Bean
	public InternalResourceViewResolver resolve() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	*/
	
//	@Bean
//	public CommandLineRunner oneToOneDemo(UserRepository userRepo, AddressRepository addRepo) {
//		
//		return args ->{
//			User user = new User("Raj","Kundra",36,'M');
//			Address address = new Address("Mumbai", "MH","India",1234);
//			user.setAddress(address);
//			address.setUser(user);
//			userRepo.save(user);
//		};
//	}
	
}


/*
 @SpringBootApplication
 It contains all the below annotations
 
 @Configuration 
 @EnableAutoConfiguration
 @ComponentScan
 */
