package com.nadyne.newapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadyne.newapi.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
