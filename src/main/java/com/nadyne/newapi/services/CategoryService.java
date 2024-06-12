package com.nadyne.newapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadyne.newapi.entities.Category;
import com.nadyne.newapi.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(long id) {
	Optional<Category> obj = repository.findById(id);
	return obj.get();
	}

}
