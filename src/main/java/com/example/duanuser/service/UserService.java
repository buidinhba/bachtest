package com.example.duanuser.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.duanuser.entity.User;

@Service
public interface UserService {
	public List<User> getListUse();
	
	
}
