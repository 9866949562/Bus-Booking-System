package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String name);

}
