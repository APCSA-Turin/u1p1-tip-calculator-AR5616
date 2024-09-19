package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                 
        double tip;
        double totalBill;
        double costPerPerson;
        double tipPerPerson;
        double totalCostPerPerson;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");

        tip = (double)(percent)/100 * cost;
        tip = (Math.round(tip * 100.0)/100.0); // https://www.educative.io/answers/how-to-use-the-java-mathround-method
        result.append("Total tip: $" + tip + "\n");

        totalBill = cost + tip;
        result.append("Total Bill with tip: $" + totalBill + "\n");

        costPerPerson = cost/people;
        costPerPerson = (Math.round(costPerPerson * 100.0)/100.0);
        result.append("Per person cost before tip: $" + costPerPerson + "\n");

        tipPerPerson = tip/people;
        tipPerPerson = (Math.round(tipPerPerson * 100.0)/100.0);
        result.append("Tip per person: $" + tipPerPerson + "\n");
        
        totalCostPerPerson = costPerPerson + tipPerPerson;
        result.append("Total cost per person: $" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;        
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
