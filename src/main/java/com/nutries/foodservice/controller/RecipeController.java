package com.nutries.foodservice.controller;

import com.nutries.foodservice.model.Recipe;
import com.nutries.foodservice.service.impl.RecipeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {


    private final RecipeServiceImpl recipeService;

    public RecipeController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable Long id) {
        return ResponseEntity.ok(recipeService.getRecipeById(id));
    }

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.createRecipe(recipe));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
        return ResponseEntity.noContent().build();
    }
}
