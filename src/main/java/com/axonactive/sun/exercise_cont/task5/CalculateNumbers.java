package com.axonactive.sun.exercise_cont.task5;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateNumbers {
    public double calculateNumbers(String filePath) throws FileNotFoundException {
        double sum = 0;
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while(scanner.hasNext()){
                double revenue = scanner.nextDouble();
                sum += revenue;
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (InputMismatchException e){
            throw new InputMismatchException();
        }
        return sum;
    }
}
