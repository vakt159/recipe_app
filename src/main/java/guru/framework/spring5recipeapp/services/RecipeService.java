package guru.framework.spring5recipeapp.services;

import guru.framework.spring5recipeapp.comands.RecipeCommand;
import guru.framework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    RecipeCommand findCommandById(Long id);
    void deleteById(Long idToDelete);
}
