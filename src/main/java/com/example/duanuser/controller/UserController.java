package com.example.duanuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.duanuser.entity.User;
import com.example.duanuser.service.UserService;

@RestController
@RequestMapping("")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/users")
	public ResponseEntity<?> getListUser(){
		List<User> users = userService.getListUse();
		return ResponseEntity.ok(users);
	}
	@PostMapping("")
	public ResponseEntity<?> creatUser(){
		return null;
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(){
		return null;
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(){
		return null;
	}
	
}
