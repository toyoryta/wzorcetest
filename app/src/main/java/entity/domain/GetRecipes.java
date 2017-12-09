package domain;

import java.util.ArrayList;
import java.util.List;

import entity.Recipe;
import repository.RecipeRepository;

/**
 * Created by pawelgorski on 26.11.2017.
 */

public class GetRecipes {

    public static List<Recipe> getRecipes (boolean isWithMeat) {
        RecipeRepository recipeRepository = new RecipeRepository();

        List<Recipe> allRecipes = recipeRepository.getAllRecipes();
        List<Recipe> tmpList = new ArrayList<Recipe>();
        Recipe recipe;

        for (int i=0;i<allRecipes.size();i++) {

            recipe = (Recipe) allRecipes.get(i);
            if (isWithMeat) {
                if (recipe.meat) tmpList.add(recipe);
            } else {
                if (recipe.wegan) tmpList.add(recipe);
            }
        }
        return tmpList;
    }
}
