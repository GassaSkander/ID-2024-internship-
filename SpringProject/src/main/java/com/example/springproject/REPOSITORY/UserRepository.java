package com.example.springproject.REPOSITORY;

import com.example.springproject.ENTITY.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
