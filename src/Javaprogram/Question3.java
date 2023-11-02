package Javaprogram;
/*3. Declare multidimensional array and store 5 countries and their capital and print them in
console.*/


public class Question3 {

    public static void main(String[] args) {
        String[][] country = {
                {"uk", "germany", "usa", "india", "france"}, {"london", "berlin", "WDC", "delhi", "paris"}
        };

        System.out.println("Countries and Capitals:");

        for (int i = 0; i < country[0].length; i++) {
            System.out.println("Country: " + country[0][i] + ", Capital: " + country[1][i]);
        }
    }
}
