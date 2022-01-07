package com.axonactive.sun.exercise1.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Contract {
    private String company;
    private LocalDate startDate;
    private int monthlySalary;
}
