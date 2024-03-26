package com.josevictorsales.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josevictorsales.course.entities.OrderItem;
import com.josevictorsales.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
