package ru.turchinovich.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
