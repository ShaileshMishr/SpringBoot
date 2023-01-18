package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
