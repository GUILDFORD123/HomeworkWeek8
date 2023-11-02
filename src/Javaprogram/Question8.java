package Javaprogram;
/*8. Write a java program to get numbers from users and print whether it is positive or negative.
*/



import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 0 to exit): ");
            int number = input.nextInt();

            if (number == 0) {
                System.out.println("Exiting the program.");
                break;
            } else if (number > 0) {
                System.out.println(number + " is a positive number.");
            } else {
                System.out.println(number + " is a negative number.");
            }
        }
    }
}
