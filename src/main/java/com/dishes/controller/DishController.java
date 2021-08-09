package com.dishes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dishes.model.Dishes;
import com.dishes.service.DishService;

@RestController
@RequestMapping("/dish")
public class DishController {
	@Autowired
	private DishService dishService;
	
	
	  @GetMapping("/getdishes") public List<Dishes> getAllDishes(){ 
		  return
	  (List<Dishes>) dishService.findAll(); 
	  }
	 
	
	@GetMapping("/getdishesById/{id}")
	public List<Dishes> getAllDishes(@PathVariable Long id){
		return dishService.findDishById(id);
	}
	
	@PostMapping("/adddishes")
	void addDish(@RequestBody Dishes dishes) {
		dishService.save(dishes);
	}

}
