package com.souhancir_voitures.service;

import java.util.List;

import com.souhancir_voitures.entities.Role;
import com.souhancir_voitures.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();


}
