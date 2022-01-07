package com.axonactive.sun.exercise1.task3;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Setter
public class FoodShop {
    private List<FoodType> foodTypeList;

    public int getPriceOfFoodType(String foodTypeName){
        for (FoodType ft: foodTypeList) {
            if (ft.getName().equals(foodTypeName)){
                return ft.getPrice();
            }
        }
        throw new NoSuchElementException();
    }
}
