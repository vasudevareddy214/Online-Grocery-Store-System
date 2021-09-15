package com.ecommerce.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;



import com.ecommerce.modal.User;
@Transactional
public interface UserService {
	
  User addUser(User user);
  
  List<User> findAllUsers();
  
  User editUser(User user, long id);
  
  User findUserById(long id);
  
  void deleteUser(long id);
  
  User findByUsername(String name);
}
