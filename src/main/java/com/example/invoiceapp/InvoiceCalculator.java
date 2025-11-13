package com.example.invoiceapp;

public class InvoiceCalculator {

    public double calculatorTotal(double price , int quantity, double taxRate){

        if(price < 0 || quantity  < 0 || taxRate < 0) {
            throw new IllegalArgumentException("Negative Values are not allowed!");
        }

        double subtotal = price *quantity;
        return subtotal +(subtotal*taxRate);
    }

    public static void main(String[] args){

        InvoiceCalculator calc = new InvoiceCalculator();
        double total = calc.calculatorTotal(100,2,0.19);
        System.out.println("Total amount with tax : "+ total);

    }


}
