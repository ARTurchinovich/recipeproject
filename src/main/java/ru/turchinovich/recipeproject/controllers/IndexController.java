package ru.turchinovich.recipeproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.turchinovich.recipeproject.domain.Category;
import ru.turchinovich.recipeproject.domain.Recipe;
import ru.turchinovich.recipeproject.domain.UnitOfMeasure;
import ru.turchinovich.recipeproject.repositories.CategoryRepository;
import ru.turchinovich.recipeproject.repositories.UnitOfMeasureRepository;
import ru.turchinovich.recipeproject.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
