package Javaprogram;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = input.nextInt();
        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = input.nextInt();

        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = input.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter English marks (0-100): ");
        int englishMarks = input.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;
        String result = (percentage >= 35) ? "Pass" : "Fail";

        String grade = "";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }

        System.out.println("-------------------------");

        System.out.println("Mark Sheet");
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("-------------------------");
        System.out.println("Subject Marks");
        System.out.println("-------------------------");
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("-------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("-------------------------");
        System.out.println("Percentage: " + percentage );
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");

    }
}
