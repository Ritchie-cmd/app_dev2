

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== STUDENT GRADE CALCULATOR =============");

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.println("Enter Quiz Score (out of 100): ");
        double quiz = Double.parseDouble(sc.nextLine());

        System.out.println("Enter Exam Score (out of 100): ");
        double exam = Double.parseDouble(sc.nextLine());

        double finalGrade = (quiz * 0.4) + (exam * 0.6);

        System.out.println("\n ============= GRADE SUMMARY ==============");
        System.out.println("Student: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Quiz Score: "+quiz);
        System.out.println("Exam Score: "+exam);
        System.out.println("Final Grade: "+finalGrade);

        if(finalGrade >= 75){
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }

        sc.close();
    }
}
