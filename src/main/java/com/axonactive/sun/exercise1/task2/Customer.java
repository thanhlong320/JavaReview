package com.axonactive.sun.exercise1.task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String name;
    private Contract contract;

    public Customer(String name){
        this.name = name;
    }


}
