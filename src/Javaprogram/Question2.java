package Javaprogram;
/*2. Declare array and store any 5 countries and print them in console.*/


public class Question2 {
    public static void main(String[] args) {
        String[] countries = {"USA", "Canada", "United Kingdom", "Australia", "Germany"};

        System.out.println("countries:");

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }
}
