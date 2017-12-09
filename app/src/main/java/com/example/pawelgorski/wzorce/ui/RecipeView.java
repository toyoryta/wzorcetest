package com.example.pawelgorski.wzorce.ui;

import com.example.pawelgorski.wzorce.entity.Recipe;

import java.util.List;


/**
 * Created by pawelgorski on 26.11.2017.
 */

public interface RecipeView {
    public void show(List<Recipe> lista);
}
