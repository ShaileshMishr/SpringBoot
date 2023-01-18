package com.training.springboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="COURSES")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseId;
	
	@Column(name="course_name")
	private String courseName;
	
	private int duration;
	private double fee;
	
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students = new HashSet<>();
	
	public Course(String courseName, int duration, double fee) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	

}