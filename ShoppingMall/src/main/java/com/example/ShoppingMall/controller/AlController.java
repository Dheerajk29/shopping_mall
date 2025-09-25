package com.example.ShoppingMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingMall.entity.Users;
import com.example.ShoppingMall.service.UsersService;

@RestController

public class AlController {
	
	@Autowired
	public UsersService alser;
    
	//insert
	@PostMapping("/addusers")
	public Users addUsers(@RequestBody Users al) { 
		return alser.addUsers(al );
	}
	//Get
		@GetMapping("/getusers")
		public List<Users> getUsers() { 
			return alser.getUsers();
		}
		//delete
				@DeleteMapping("/deleteusers/{al}")
				public void deleteUsers(@PathVariable int al) { 
					alser.deleteAl(al);
				}
}
