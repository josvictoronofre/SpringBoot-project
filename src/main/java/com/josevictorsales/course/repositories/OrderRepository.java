package com.josevictorsales.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josevictorsales.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    
}
