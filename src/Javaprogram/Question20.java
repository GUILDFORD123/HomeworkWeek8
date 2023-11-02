package Javaprogram;
/*20. Write a Java program to sort a numeric array and a string array.*/


import java.util.Arrays;

public class Question20 {




    public static void main(String[] args) {
        int[] numericArray = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numericArray);

        System.out.println("Sorted Numeric Array:");
        for (int num : numericArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        String[] stringArray = {"guildford", "brookwood", "degnaham", "fratton" ,"lexington"};
        Arrays.sort(stringArray);

        System.out.println("Sorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}




