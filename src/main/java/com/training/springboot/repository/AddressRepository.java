package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.springboot.model.Address;

@RepositoryRestResource(path="contact")
public interface AddressRepository extends JpaRepository<Address, Long> {

}
