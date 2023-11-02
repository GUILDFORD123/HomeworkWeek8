package Javaprogram;

import java.util.Scanner;

public class Question11 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an alphabet (A to F): ");
            char alphabet = input.next().charAt(0);

            if (alphabet >= 'A' && alphabet <= 'F') {
                if (alphabet == 'A') {
                    System.out.println("City: Ahmedabad");
                } else if (alphabet == 'B') {
                    System.out.println("City: Brookwood");
                } else if (alphabet == 'C') {
                    System.out.println("City: Changa");
                } else if (alphabet == 'D') {
                    System.out.println("City: Delhi");
                } else if (alphabet == 'E') {
                    System.out.println("City: East london");
                } else if (alphabet == 'F') {
                    System.out.println("City: France");
                }
            } else {
                System.out.println("Invalid entry. Please enter an alphabet from A to F.");
            }
        }
    }

