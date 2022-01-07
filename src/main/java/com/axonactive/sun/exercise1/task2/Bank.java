package com.axonactive.sun.exercise1.task2;

import java.time.Duration;
import java.time.LocalDate;

public class Bank {
    public boolean validate(Customer customer){
        LocalDate nowDate = LocalDate.now();
        long daysWorked = Duration.between(customer.getContract().getStartDate().atStartOfDay(), nowDate.atStartOfDay()).toDays();
        double yearsWorked = daysWorked / 365;
        if (yearsWorked >= 2.0 && customer.getContract().getMonthlySalary()*12 >= 30000){
            return true;
        } else{
            return false;
        }
    }
}
