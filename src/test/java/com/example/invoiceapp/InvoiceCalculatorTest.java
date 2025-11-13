package com.example.invoiceapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceCalculatorTest {

    @Test
    void testCalculateTotal(){

        InvoiceCalculator calc = new InvoiceCalculator();
        double result = calc.calculatorTotal(100, 2, 0.19);
        assertEquals(238.0, result, 0.01);

    }
}
