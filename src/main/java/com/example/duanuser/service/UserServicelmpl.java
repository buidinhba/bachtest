package com.example.duanuser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.duanuser.entity.User;

@Component
public class UserServicelmpl implements UserService{
	private static ArrayList<User> users = new ArrayList<User>();
	static {
     
		users.add(new User(1, "Nguyễn Thị Hồng","hong@gmail.com","0987654321","avatar.img","123"));
        users.add(new User(2, "Bùi Như Lạc", "laclac@gmail.com","0123456789","avatar1.img","123"));
        users.add(new User(3, "Phan Thị Hạnh", "hanh@gmail.com","0987564664","avatar3.img","123"));
        users.add(new User(4, "Bành Thị Quỳnh", "qunh@gmail.com","0874845455","avatar9.img","123"));
    

}
	@Override
	public List<User> getListUse() {
		// TODO Auto-generated method stub
		return users;
	}
	
	
}
