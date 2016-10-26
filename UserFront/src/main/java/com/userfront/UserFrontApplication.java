package com.userfront;

import com.userfront.domain.User;
import com.userfront.domain.security.Role;
import com.userfront.domain.security.UserRole;
import com.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class UserFrontApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(UserFrontApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("Adams");
		user1.setPhone("1234567890");
		user1.setUsername("JAdams");
		user1.setPassword("password");
		user1.setEmail("JAdams@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));
		userService.createUser(user1, userRoles);

		userRoles.clear();
		User user2 = new User();
		user2.setFirstName("Ben");
		user2.setLastName("Franklin");
		user2.setPhone("1234567890");
		user2.setUsername("BFranklin");
		user2.setPassword("password");
		user2.setEmail("BFranklin@gmail.com");
		Role role2 = new Role();
		role2.setRoleId(1);
		role2.setName("ROLE_USER");
		userRoles.add(new UserRole(user2, role2));
		userService.createUser(user2, userRoles);

	}
}
