//package com.training.springboot.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.training.springboot.model.User;
//
//@RestController
//public class HomeController {
//
//	@GetMapping("/users")
//	public ResponseEntity <List<User>> sayHi() {
//		
//		List<User> userList = new ArrayList<>();
//		userList.add(new User("Shailesh","Mishra",22,'M'));
//		userList.add(new User("Kishan","Mishra",21,'M'));
//		userList.add(new User("Priya","Reddy",22,'F'));
//		userList.add(new User("Nicole","Porter",24,'F'));
//		return new ResponseEntity(userList, HttpStatus.OK);
//	}
// }
