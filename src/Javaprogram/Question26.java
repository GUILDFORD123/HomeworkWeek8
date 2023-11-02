package Javaprogram;
/*26. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd*/


public class Question26 {
    public static void main(String[] args) {

        String name = "Ripti";
        char[] reversename = name.toCharArray();
        System.out.println(name);
        int i;
        for (i = reversename.length - 1; i >= 0; i--) {
            System.out.println(reversename[i]);


        }

    }

}





