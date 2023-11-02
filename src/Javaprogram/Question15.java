package Javaprogram;
/*15. Write a program that tells us input value is number or an alphabet orsymbol.*/


import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("D: ");
        char variable = scanner.next().charAt(1);

        if (Character.isDigit(variable)) {
            System.out.println(" a number.");
        } else if (Character.isLetter(variable)) {
            System.out.println("alphabet letter.");
        } else {
            System.out.println(" symbol.");
        }

    }
}


