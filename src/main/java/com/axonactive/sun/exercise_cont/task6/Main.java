package com.axonactive.sun.exercise_cont.task6;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task6/Apr2010.txt");
        System.out.println(calculateRevenue.calculateTotalRevenue(revenueByDayList));
        System.out.println(calculateRevenue.calculateAverageRevenuePerDay(revenueByDayList));
    }
}
