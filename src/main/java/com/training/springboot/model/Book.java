package com.training.springboot.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
@Table(name="BOOK_NEW")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookId;
	
	private String title;
	private String author;
	
	@OneToMany(mappedBy="book", cascade=CascadeType.ALL)
	private Set<Page> pages;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	

}