package ru.turchinovich.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.recipeproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
