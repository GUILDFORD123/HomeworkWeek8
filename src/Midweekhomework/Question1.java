package Midweekhomework;

import java.util.Scanner;
/* 1. Take 10 integers from keyboard using loop and print their average value on the
screen.*/


public class Question1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter integer " + i + "= ");
                int num = scanner.nextInt();
                sum += num;
            }

            double average = (double) sum / 10;

            System.out.println("Average of the 10 integers: " + average);


        }
    }

