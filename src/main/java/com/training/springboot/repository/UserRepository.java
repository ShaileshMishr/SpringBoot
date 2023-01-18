package com.training.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.springboot.model.User;

@RepositoryRestResource(path="users")
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByFirstName(@Param("firstName") String firstName);
	

	List<User> findByAge(@Param("age") int age);
}
