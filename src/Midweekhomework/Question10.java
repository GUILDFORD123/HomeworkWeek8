package Midweekhomework;
/* 10. Write a program to print the sum of two numbers entered by user by defining your
own method.*/


public class Question10 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        double sum = calculateSum(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }


    public static double calculateSum(int a, int b) {
        return a + b;
    }
}



