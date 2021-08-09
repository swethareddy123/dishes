package com.dishes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dishes.model.Dishes;
import com.dishes.repository.DishRepository;


@Service
public class DishService {

	@Autowired
	private DishRepository dishRepository;
	
	
	  public List<Dishes> findAll(){ List<Dishes> dishes = new ArrayList<>();
	  dishRepository.findAll().forEach(dishes::add); return dishes; }
	 
	
	public List<Dishes> findDishById(Long id){
		List<Dishes> dishes = new ArrayList<>();
		dishes = dishRepository.findAll();
		return dishes.stream().filter(dish -> dish.getId().equals(id)).collect(Collectors.toList());
	}
	
	public void save(Dishes dishes) {
		dishRepository.save(dishes);
	}
	
}
