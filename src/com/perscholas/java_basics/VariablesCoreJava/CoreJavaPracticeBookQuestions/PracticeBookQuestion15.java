package com.perscholas.java_basics.VariablesCoreJava.CoreJavaPracticeBookQuestions;

public class PracticeBookQuestion15 {
    public static void main(String[] args) {
        //stock commission calculator
        int katStocks = 100;
        double stockPrice = 5;
        double commission = 0.02;

        double stockPaidAlone = katStocks * stockPrice;
        System.out.println(stockPaidAlone);

        double stockCommission = stockPaidAlone * commission;
        System.out.println(stockCommission);

        double totalStockPrice = stockCommission + stockPaidAlone;
        System.out.println(totalStockPrice);
    }
}
