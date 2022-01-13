package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
