package com.axonactive.sun.exercise_cont.task6;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateRevenueTest {

    @Test
    void getListRevenueByDay_ValidFilePathAndHas30RevenueByDay_ShouldReturnListSize30() throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task6/Apr2010.txt");
        assertEquals(30, revenueByDayList.size());
    }

    @Test
    void calculateTotalRevenue_ShouldReturn16500dot0() throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task6/Apr2010.txt");
        assertEquals(16500.00, calculateRevenue.calculateTotalRevenue(revenueByDayList));
    }

    @Test
    void calculateAverageRevenuePerDay_ShouldReturn550dot0() throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task6/Apr2010.txt");
        assertEquals(550.0, calculateRevenue.calculateAverageRevenuePerDay(revenueByDayList));
    }
}