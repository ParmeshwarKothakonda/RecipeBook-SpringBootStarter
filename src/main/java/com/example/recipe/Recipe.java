package com.example.recipe;

import java.util.List;

class Recipe{
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    Recipe(int recipeId,String recipeName,String recipeType,List<String> ingredients){
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;
    }
    public void setRecipeId(int recipeId){
        this.recipeId = recipeId;
    }

    public int getRecipeId(){ //Getter
        return this.recipeId;
    }

    public void setRecipeName(String recipeName){
        this.recipeName = recipeName;
    }

    public String getRecipeName(){ //Getter
        return this.recipeName;
    }

    public void setRecipeType(String recipeType){
        this.recipeType = recipeType;
    }

    public String getRecipeType(){ //Getter
        return this.recipeType;
    } 

    public void setIngredients(List<String> ingredients){
        this.ingredients = ingredients;
    }

    public List<String> getIngredients(){ //Getter
        return this.ingredients;
    }
}