package ru.turchinovich.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
