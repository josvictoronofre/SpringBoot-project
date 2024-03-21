package com.josevictorsales.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josevictorsales.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    
}
