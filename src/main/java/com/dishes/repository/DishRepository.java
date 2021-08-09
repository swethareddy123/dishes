package com.dishes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dishes.model.Dishes;

@Repository
public interface DishRepository extends MongoRepository<Dishes, Long> {

}