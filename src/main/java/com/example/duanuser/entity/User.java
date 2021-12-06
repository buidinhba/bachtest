package com.example.duanuser.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
     private int _id;
     private String _name;
     private String _email;
	 private String _phone;
	 private String _avatar;
	 private String _password;
	 
	 
public User(int id, String name, String email, String phone, String avatar, String password) {
	_id = id;
	String _email = email;
	String _phone = phone;
	String _name = name;
	String _avatar = avatar;
	String _password = password;
	
}
	 
}

