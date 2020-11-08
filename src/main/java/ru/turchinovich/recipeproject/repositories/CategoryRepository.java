package ru.turchinovich.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
