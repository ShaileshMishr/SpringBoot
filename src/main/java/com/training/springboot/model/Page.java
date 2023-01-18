package com.training.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="PAGES")
public class Page {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long pageId;
	
	@Column(name="page_number")
	private int pageNumber;
	
	private String content;
	
	@ManyToOne
	@JoinColumn(name="book_id", nullable=false)
	private Book book;

	public Page(int pageNumber, String content, Book book) {
		super();
		this.pageNumber = pageNumber;
		this.content = content;
		this.book = book;
	}
	
	

}