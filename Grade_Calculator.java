package CODSOFT;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER NUMBER OF SUBJECTS :");
        int numS = sc.nextInt();

        if(numS<=0)
        {
            System.out.println(" INVALID NUMBER OF SUBJECTS :");
            return;
        }
        float totalMarks = 0;
        int maxMarks = 100;

        for( int i = 1; i<=numS;i++) {
            System.out.println("ENTER MARKS OF SUBJECT " + i + " : ");
            int marks = sc.nextInt();

            if (marks <= 100 && marks >= 0) {
                totalMarks += marks;
            }
            else {
                System.out.println(" PLEASE ENTER VALID MARKS :");
                i--;
            }
        }
            float averagePercentage = (totalMarks / (numS * maxMarks)) * 100;

            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 75 && averagePercentage < 90) {
                grade = 'B';
            } else if (averagePercentage >= 60 && averagePercentage < 75) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println(" -----------------------------------------------------");
            System.out.println(" TOTAL MARKS OBTAINED : " + totalMarks);
            System.out.println(" AVERAGE PERCENTAGE : " + averagePercentage + "%");
            System.out.println(" GRADE : " + grade);
            System.out.println(" -----------------------------------------------------");

    }
}
