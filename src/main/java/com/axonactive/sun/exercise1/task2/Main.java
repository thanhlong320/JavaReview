package com.axonactive.sun.exercise1.task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020,5,6);
        Contract contract = new Contract("Axon active", startDate, 5000);
        Customer customer = new Customer("Nguyen Thanh Long");
        customer.setContract(contract);
        Bank bank = new Bank();
        System.out.println(bank.validate(customer));
    }
}
