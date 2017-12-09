package com.example.pawelgorski.wzorce.repository;

import com.example.pawelgorski.wzorce.entity.Recipe;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by pawelgorski on 26.11.2017.
 */

public class RecipeRepository {
    public List<Recipe> getAllRecipes() {
        List<Recipe> tmpList = new ArrayList<Recipe>();
        tmpList.add(new Recipe("meat1",true,false));
        tmpList.add(new Recipe("meat2",true,false));
        tmpList.add(new Recipe("meat3",true,false));

        tmpList.add(new Recipe("weg1",false,true));
        tmpList.add(new Recipe("weg2",false,true));
        tmpList.add(new Recipe("web3",false,true));

        return tmpList;
        }
    }

