package Javaprogram;
/*19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/


import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        input.close();
    }
}


