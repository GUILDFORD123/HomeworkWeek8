package Midweekhomework;
/* 2. Print multiplication table of 24, 50 and 29 using loop.*/



public class Question2 {

    public static void main(String[] args) {
        int[] numbers = {24, 50, 29};

        for (int number : numbers) {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            System.out.println();
        }
    }
}

