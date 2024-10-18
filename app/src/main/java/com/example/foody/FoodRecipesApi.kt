package com.example.foody

import com.example.foody.models.FoodRecipe
import retrofit2.http.GET
import retrofit2.http.QueryMap


interface FoodRecipesApi {
    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ): retrofit2.Response<FoodRecipe>
}