package com.example.pawelgorski.wzorce.presentation;

import com.example.pawelgorski.wzorce.domain.GetRecipes;
import com.example.pawelgorski.wzorce.ui.RecipeView;

/**
 * Created by pawelgorski on 26.11.2017.
 */

public class RecipePresenter {

    RecipeView recipeView;

    public void onAttach(RecipeView recipeView){

        this.recipeView = recipeView;
    }

    public void onDetach() {
        recipeView = null;
    }

    public void show(boolean isWithMeal) {

        recipeView.show(GetRecipes.getRecipes(isWithMeal));
    }
}
