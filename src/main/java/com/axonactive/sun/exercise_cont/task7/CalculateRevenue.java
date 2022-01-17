package com.axonactive.sun.exercise_cont.task7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
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
                String date = splited[0];
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(date, formatter);
                double revenue = Double.parseDouble(splited[1]);
                RevenueByDay revenueByDay = new RevenueByDay(localDate, revenue);
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

    public double calculateRevenuePerMonth(List<RevenueByDay> revenueByDayList, int month){
        double sum = 0;
        for(RevenueByDay revenueByDay : revenueByDayList){
            if (revenueByDay.getDate().getMonth() == Month.of(month)){
                sum += revenueByDay.getRevenue();
            }
        }
        return sum;
    }
}
