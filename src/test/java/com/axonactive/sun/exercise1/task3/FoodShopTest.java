package com.axonactive.sun.exercise1.task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FoodShopTest {
    private FoodShop foodShop = new FoodShop();

    @BeforeEach
    public void initForEachTest(){
        FoodType foodTypeA = new FoodType("A",30);
        FoodType foodTypeB = new FoodType("B",20);
        FoodType foodTypeC = new FoodType("C",10);
        List<FoodType> foodTypeList = new ArrayList<>();
        foodTypeList.add(foodTypeA);
        foodTypeList.add(foodTypeB);
        foodTypeList.add(foodTypeC);

        foodShop.setFoodTypeList(foodTypeList);
    }

    @Test
    public void getPriceOfFoodType_NameA_ShouldReturn30(){
        assertEquals(30,foodShop.getPriceOfFoodType("A"));
    }

    @Test
    public void getPriceOfFoodType_NameB_ShouldReturn20(){
        assertEquals(20,foodShop.getPriceOfFoodType("B"));
    }

    @Test
    public void getPriceOfFoodType_NameC_ShouldReturn10(){
        assertEquals(10,foodShop.getPriceOfFoodType("C"));
    }

    @Test
    public void getPriceOfFoodType_NameD_ShouldReturnNoSuchElementException(){
        assertThrows(NoSuchElementException.class,
                () -> {foodShop.getPriceOfFoodType("D");}
        );
    }

//    @Test(expected = NoSuchElementException.class)
//    public void getPriceOfFoodType_NameD_ShouldReturnNoSuchElementException2(){
//        foodShop.getPriceOfFoodType("D");
//    }
}