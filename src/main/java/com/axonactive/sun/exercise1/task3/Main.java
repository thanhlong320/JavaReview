package com.axonactive.sun.exercise1.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoodType foodTypeA = new FoodType("A",30);
        FoodType foodTypeB = new FoodType("B",20);
        FoodType foodTypeC = new FoodType("C",10);
        List<FoodType> foodTypeList = new ArrayList<>();
        foodTypeList.add(foodTypeA);
        foodTypeList.add(foodTypeB);
        foodTypeList.add(foodTypeC);

        FoodShop foodShop = new FoodShop();
        foodShop.setFoodTypeList(foodTypeList);

        System.out.println(foodShop.getPriceOfFoodType("D"));
    }
}
