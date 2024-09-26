package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        
        // initializing variables
        double tip;
        double totalBill;
        double costPerPerson;
        double tipPerPerson;
        double totalCostPerPerson;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");

        // calculating all values
        tip = (double)(percent)/100 * cost;
        totalBill = cost + tip;
        costPerPerson = cost/people;
        tipPerPerson = tip/people;
        totalCostPerPerson = costPerPerson + tipPerPerson;

        // rounding all values to the nearest hundredth
        tip = (Math.round(tip * 100.0)/100.0); // I learned how to round here: https://www.educative.io/answers/how-to-use-the-java-mathround-method
        totalBill = (Math.round(totalBill * 100.0)/100.0);
        costPerPerson = (Math.round(costPerPerson * 100.0)/100.0);
        tipPerPerson = (Math.round(tipPerPerson * 100.0)/100.0);
        totalCostPerPerson = (Math.round(totalCostPerPerson * 100.0)/100.0);

        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + totalBill + "\n");
        result.append("Per person cost before tip: $" + costPerPerson + "\n");
        result.append("Tip per person: $" + tipPerPerson + "\n");
        result.append("Total cost per person: $" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 2;
        int percent = 5;
        double cost = 29.56;        
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
