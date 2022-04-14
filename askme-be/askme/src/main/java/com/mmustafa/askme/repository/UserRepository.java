package com.mmustafa.askme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmustafa.askme.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
