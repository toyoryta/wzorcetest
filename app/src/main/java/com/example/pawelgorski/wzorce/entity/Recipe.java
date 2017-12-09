package com.example.pawelgorski.wzorce.entity;

/**
 * Created by pawelgorski on 26.11.2017.
 */

public class Recipe {

    public String descripton;
    public boolean meat;
    public boolean wegan;

    public Recipe(String descripton, boolean meat, boolean wegan){
        this.descripton=descripton;
        this.meat=meat;
        this.wegan=wegan;

    }
}
