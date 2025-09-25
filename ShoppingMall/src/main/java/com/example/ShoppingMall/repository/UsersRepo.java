package com.example.ShoppingMall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ShoppingMall.entity.Users;

public interface UsersRepo extends JpaRepository<Users, Integer> {
    // no need to write any methods, JpaRepository gives you save(), findAll(), deleteById(), etc.
}