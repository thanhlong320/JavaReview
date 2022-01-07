package com.axonactive.sun.exercise1.task1;

import com.axonactive.sun.exercise1.task1.Transcript;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranscriptTest {

    @Test
    public void calculateAverage_Valid_ShouldReturn75(){
        Transcript transcript = new Transcript(50,75,100);
        assertEquals(75.0, transcript.calculateAverage());
    }

    @Test
    public void calculateGrade_Average90_ShouldReturnA(){
        Transcript transcript = new Transcript(90,90,90);
        assertEquals("A", transcript.calculateGrade());
    }

    @Test
    public void calculateGrade_Average80_ShouldReturnB(){
        Transcript transcript = new Transcript(80,80,80);
        assertEquals("B", transcript.calculateGrade());
    }

    @Test
    public void calculateGrade_Average70_ShouldReturnC(){
        Transcript transcript = new Transcript(70,70,70);
        assertEquals("C", transcript.calculateGrade());
    }

    @Test
    public void calculateGrade_Average60_ShouldReturnD(){
        Transcript transcript = new Transcript(60,60,60);
        assertEquals("D", transcript.calculateGrade());
    }

    @Test
    public void calculateGrade_Average59_ShouldReturnF(){
        Transcript transcript = new Transcript(59,59,59);
        assertEquals("F", transcript.calculateGrade());
    }

}