package com.axonactive.sun.exercise0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayrollRecordTest {
    @Test
    public void calculateGrossPay_ValidInput_ShouldReturn3000(){
        PayrollRecord payrollRecord = new PayrollRecord(150, 20.0);
        assertEquals(3000, payrollRecord.calculateGrossPay());
    }

    @Test
    public void calculateGrossPay_ValidInput_ShouldReturn6100(){
        PayrollRecord payrollRecord = new PayrollRecord(200, 30.5);
        assertEquals(6100, payrollRecord.calculateGrossPay());
    }
}