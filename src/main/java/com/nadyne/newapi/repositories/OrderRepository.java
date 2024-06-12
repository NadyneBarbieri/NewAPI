package com.nadyne.newapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadyne.newapi.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
