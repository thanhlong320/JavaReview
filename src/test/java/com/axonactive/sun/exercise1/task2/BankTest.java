package com.axonactive.sun.exercise1.task2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    public void validate_AllConditionEnough_ShouldReturnTrue(){
        LocalDate startDate = LocalDate.of(2020,1,1);
        Contract contract = new Contract("Axon active", startDate, 5000);
        Customer customer = new Customer("Nguyen Thanh Long");
        customer.setContract(contract);
        Bank bank = new Bank();
        assertEquals(true,bank.validate(customer));
    }

    @Test
    public void validate_YearlySalaryNotEnough_ShouldReturnFalse(){
        LocalDate startDate = LocalDate.of(2020,1,1);
        Contract contract = new Contract("Axon active", startDate, 1000);
        Customer customer = new Customer("Nguyen Thanh Long");
        customer.setContract(contract);
        Bank bank = new Bank();
        assertEquals(false,bank.validate(customer));
    }

    @Test
    public void validate_YearsWorkedNotEnough_ShouldReturnFalse(){
        LocalDate startDate = LocalDate.of(2020,12,12);
        Contract contract = new Contract("Axon active", startDate, 5000);
        Customer customer = new Customer("Nguyen Thanh Long");
        customer.setContract(contract);
        Bank bank = new Bank();
        assertEquals(false,bank.validate(customer));
    }
}