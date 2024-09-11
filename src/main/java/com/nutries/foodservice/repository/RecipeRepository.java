package com.nutries.foodservice.repository;

import com.nutries.foodservice.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
