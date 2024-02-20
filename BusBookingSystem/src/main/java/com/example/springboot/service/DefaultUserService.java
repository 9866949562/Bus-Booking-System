package com.example.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.springboot.DTO.UserRegisteredDTO;
import com.example.springboot.model.User;


public interface DefaultUserService extends UserDetailsService{
	void save(UserRegisteredDTO userRegisteredDTO);


}
