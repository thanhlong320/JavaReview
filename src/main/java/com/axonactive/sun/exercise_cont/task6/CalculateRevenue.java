package com.axonactive.sun.exercise_cont.task6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CalculateRevenue {
    public List<RevenueByDay> getListRevenueByDay(String filePath) throws IOException {
        List<RevenueByDay> revenueByDayList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] splited = line.split(" ");
                int date = Integer.parseInt(splited[0]);
                double revenue = Double.parseDouble(splited[1]);
                RevenueByDay revenueByDay = new RevenueByDay(date, revenue);
                revenueByDayList.add(revenueByDay);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new IOException();
        }
        return revenueByDayList;
    }

    public double calculateTotalRevenue(List<RevenueByDay> revenueByDayList){
        double sum = 0;
        for(RevenueByDay revenueByDay : revenueByDayList){
           sum += revenueByDay.getRevenue();
        }
        return sum;
    }

    public double calculateAverageRevenuePerDay(List<RevenueByDay> revenueByDayList){
        double sum = calculateTotalRevenue(revenueByDayList);
        return sum / revenueByDayList.size();
    }
}
