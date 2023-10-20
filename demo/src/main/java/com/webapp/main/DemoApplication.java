

package com.webapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.webapp.main.dao.UserRepo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		UserRepo userRepository = context.getBean(UserRepo.class);
		
		User user = new User();
		user.setUsername("Alpha");
		user.setCity("Pune");
		user.setContact("1234567890");
		user.setOccupation("Creator");
		
		User user1 = userRepository.save(user);
		
		System.out.println("User saved : "+user1);
	}

}
