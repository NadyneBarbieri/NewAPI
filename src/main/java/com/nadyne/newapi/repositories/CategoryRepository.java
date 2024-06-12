package com.nadyne.newapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadyne.newapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long >{

}
