package Javaprogram;
/*22. Write a Java program to calculate the average value of array elements.*/


public class Question22 {

    public static void main(String[] args) {
        int[] number = {1, 3, 4, 10, 11, 9};
        int sum = 0;
        int i;


        for (i = 0; i < args.length; i++) {
            sum += number[i];
        }
        System.out.println( " the sum is: " + sum);
    }
}


