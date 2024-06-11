package com.nadyne.newapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadyne.newapi.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
