package Midweekhomework;
/* 7. Take input of age of 3 people by user and determine oldest and youngest among
them.*/


import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 100;
        int youngestAge = 20;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the age of person " + i + ": ");
            int age = scanner.nextInt();

            if (age > oldestAge) {
                oldestAge = age;
            }

            if (age < youngestAge) {
                youngestAge = age;
            }


            System.out.println("The oldest person is " + oldestAge + " years old.");
            System.out.println("The youngest person is " + youngestAge + " years old.");


        }
    }
}


