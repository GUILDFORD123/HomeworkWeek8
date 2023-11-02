package Javaprogram;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = input.next().charAt(0);

        switch (alphabet) {
            case 'A':
                System.out.println("City: Amsterdam");
                break;
            case 'B':
                System.out.println("City: Berlin");
                break;
            case 'C':
                System.out.println("City: Chicago");
                break;
            case 'D':
                System.out.println("City: Delhi");
                break;
            case 'E':
                System.out.println("City: Edinburgh");
                break;
            case 'F':
                System.out.println("City: France");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet between A and F.");
        }

    }
}
