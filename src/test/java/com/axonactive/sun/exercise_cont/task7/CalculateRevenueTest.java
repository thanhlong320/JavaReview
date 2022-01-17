package com.axonactive.sun.exercise_cont.task7;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateRevenueTest {

    @Test
    void getListRevenueByDay_ValidFilePathAndHas50RevenueByDay_ShouldReturnListSize50() throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task7/2010.txt");
        assertEquals(50, revenueByDayList.size());
    }

    @Test
    void calculateTotalRevenue_ShouldReturn27500dot0() throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task7/2010.txt");
        assertEquals(27500.0, calculateRevenue.calculateTotalRevenue(revenueByDayList));
    }

    @Test
    void calculateAverageRevenuePerDay_ShouldReturn550dot0() throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task7/2010.txt");
        assertEquals(550.0, calculateRevenue.calculateAverageRevenuePerDay(revenueByDayList));
    }

    @Test
    void calculateRevenuePerMonth_January_ShouldReturn5500dot0() throws IOException {
        CalculateRevenue calculateRevenue = new CalculateRevenue();
        List<RevenueByDay> revenueByDayList = calculateRevenue.getListRevenueByDay("src/main/java/com/axonactive/sun/exercise_cont/task7/2010.txt");
        assertEquals(5500.0, calculateRevenue.calculateRevenuePerMonth(revenueByDayList,1));
    }
}