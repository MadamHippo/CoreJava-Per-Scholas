package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

public class PracticeBookQuestion19 {
    public static void main(String[] args) {
        //Stock transaction program...
        int sharesBoughtOrSold = 1000;
        double sharesPriceBefore = 32.87;
        double commission = 0.20;
        double sharesPriceAfter = 33.92;

        double totalPurchaseCost = sharesBoughtOrSold * sharesPriceBefore;
        double commissionsPaid = totalPurchaseCost * commission;
        double totalSoldPrice = sharesPriceAfter * sharesBoughtOrSold;
        double commissionsPaid2 = totalSoldPrice * commission;

        double joesProfit = commissionsPaid2 - commissionsPaid;
        System.out.println(joesProfit);
        // joe made $210 dollars after 2 weeks of holding onto Acme software. Also he should look for another stockbroker because 2% buy/sell fee is a total SCAM.
    }
}
