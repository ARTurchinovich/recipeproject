package ru.turchinovich.recipeproject.services;

import ru.turchinovich.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
