package com.nadyne.newapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadyne.newapi.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
