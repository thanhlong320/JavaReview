package com.axonactive.sun.exercise1.task1;

import lombok.*;
@Setter
@AllArgsConstructor
public class Transcript {
    private int developScore;
    private int essayScore;
    private int interviewScore;

    public double calculateAverage(){
        return (developScore + essayScore + interviewScore) / 3;
    }

    public String calculateGrade(){
        double average = this.calculateAverage();
        if (average >= 90){
            return "A";
        } else if (average < 90 && average >= 80){
            return "B";
        } else if (average < 80 && average >= 70){
            return "C";
        } else if (average < 70 && average >= 60){
            return "D";
        } else{
            return "F";
        }
    }


}

