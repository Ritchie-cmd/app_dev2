
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== ASSIGNMENT DEADLINE TRACKER =============");

        System.out.println("Assignment Name: ");
        String assignment = sc.nextLine();

        System.out.println("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.println("Enter Due Date: ");
        String dueDate = sc.nextLine();

        System.out.println("Enter The Priority (High/Medium/Low)");
        String level = sc.nextLine();

        System.out.println("Enter Status (Pending/Completed)");
        String status = sc.nextLine();

        System.out.println("\n ============= ASSIGNMENT INFORMATION ==============");
        System.out.println("Assignment: "+assignment);
        System.out.println("Subject: "+subject);
        System.out.println("Due Date: "+dueDate);
        System.out.println("Priority: "+level);
        System.out.println("Status: "+status);

        sc.close();
    }
}