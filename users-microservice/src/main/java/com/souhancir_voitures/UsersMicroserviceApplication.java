package com.souhancir_voitures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.souhancir_voitures.entities.Role;
import com.souhancir_voitures.entities.User;
import com.souhancir_voitures.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroserviceApplication {

	@Autowired
	UserService userService;

	@PostConstruct
	void init_users() {
		// ajouter les rôles
		if(userService.findUserByUsername("admin") == null) {
			userService.addRole(new Role(null, "ADMIN"));
			userService.addRole(new Role(null, "USER"));
			// ajouter les users
			userService.saveUser(new User(null,"admin","123",true,null));
			userService.saveUser(new User(null, "souha", "123", true, null));
			userService.saveUser(new User(null, "yassine", "123", true, null));
			// ajouter les rôles aux users
			userService.addRoleToUser("admin", "ADMIN");
			userService.addRoleToUser("admin", "USER");
			userService.addRoleToUser("souha", "USER");
			userService.addRoleToUser("yassine", "USER");
		}
	}


	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

}