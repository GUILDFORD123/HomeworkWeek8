package Javaprogram;
/* 10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2% */


public class Question10 {
    public static void main(String[] args) {
        int salesId = 12345;
        String sellerName = "Ripti";
        double salesAmount = 40000.0;
        double basicSalary = 3000.0;

        double commission;

        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        double totalSalary = basicSalary + commission;

        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Commission: $" + commission);
        System.out.println("Total Salary: $" + totalSalary);
    }
}



