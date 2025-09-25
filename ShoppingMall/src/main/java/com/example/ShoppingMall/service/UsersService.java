package com.example.ShoppingMall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShoppingMall.entity.Users;
import com.example.ShoppingMall.repository.UsersRepo;

@Service

public class UsersService {
	
	

		//insert,delete,retrieve,update
		@Autowired
		public UsersRepo erepo;
		
		//inserting data
		public Users addUsers(Users al) {
			return erepo.save(al);
		}
		
		//getting the data from database
		public List<Users> getUsers(){
			return erepo.findAll();
		}
		
		//delete the data from database
		public void deleteAl(int alid) {
			erepo.deleteById(alid);
		}
	}