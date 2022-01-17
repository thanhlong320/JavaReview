package com.axonactive.sun.exercise_cont.task7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class RevenueByDay {
    private LocalDate date;
    private double revenue;
}
