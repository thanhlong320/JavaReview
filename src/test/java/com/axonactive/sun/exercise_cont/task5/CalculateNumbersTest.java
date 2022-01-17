package com.axonactive.sun.exercise_cont.task5;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class CalculateNumbersTest {

    @Test
    public void calculateNumbers_ValidFilePath_ShouldReturn75dot1() throws FileNotFoundException {
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        double sum = calculateNumbers.calculateNumbers("src/main/java/com/axonactive/sun/exercise_cont/task5/Numbers.txt");
        assertEquals(75.1, sum);
    }

    @Test
    public void calculateNumbers_InvalidFilePath_ShouldReturnFileNotFileException() {
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        assertThrows(FileNotFoundException.class, () ->{
            double sum = calculateNumbers.calculateNumbers("Numbers.txt");
        });
    }

    @Test
    public void calculateNumbers_InvalidData_ShouldReturnInputMismatchException(){
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        assertThrows(InputMismatchException.class, () ->{
            double sum = calculateNumbers.calculateNumbers("src/main/java/com/axonactive/sun/exercise_cont/task5/Numbers_wrong_format.txt");
        });
    }
}