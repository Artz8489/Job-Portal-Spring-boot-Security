package com.tanveer.springbootrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tanveer.springbootrest.model.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
