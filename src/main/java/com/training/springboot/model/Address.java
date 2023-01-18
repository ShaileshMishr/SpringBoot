package com.training.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	private long addressId;
	private String city;
	private String state;
	private String country;
	private long zip;
	
	@OneToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="user_id", nullable = false)
	private User user;
	
	public Address(String city, String state, String country, long zip) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	
	}
	
	
}
