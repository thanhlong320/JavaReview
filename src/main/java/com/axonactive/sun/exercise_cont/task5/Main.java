package com.axonactive.sun.exercise_cont.task5;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        System.out.println(calculateNumbers.calculateNumbers("src/main/java/com/axonactive/sun/exercise_cont/task5/Numbers.txt"));
    }
}
