package com.axonactive.sun.exercise0;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PayrollRecord {
    private int nWorkingHours;
    private double hourlyPayRate;

    public double calculateGrossPay(){
        if (nWorkingHours > 0 && hourlyPayRate > 0) {
            return nWorkingHours * hourlyPayRate;
        } else{
            return -1;
        }

    }
}
