package com.training.springboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="STUDENT_NEW")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	
	@Column(name="stud_name")
	private String studName;
	
	private int age;
	private String grade;
	
	@ManyToMany
	@JoinTable(name = "STUDENTS_COURSES", 
			joinColumns = {
					@JoinColumn(name = "stud_id", referencedColumnName="studId",
							nullable = false, updatable = false)},
			inverseJoinColumns = {
					@JoinColumn(name = "course_id", referencedColumnName="courseId",
							nullable = false, updatable = false)})
	private Set<Course> courses = new HashSet<>();
	
	public Student(String studName, int age, String grade) {
		super();
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}
	
	

}