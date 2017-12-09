package domain;

import java.util.List;

import entity.Recipe;

/**
 * Created by pawelgorski on 26.11.2017.
 */

public interface RecipeView {
    public void show(List<Recipe> lista);
}
