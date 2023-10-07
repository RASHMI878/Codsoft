import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your roll number : ");
        int rno = in.nextInt();
        System.out.print("Enter your Name : ");
        String name = in.next();
        System.out.print("Enter the marks in Artificial Intelligence : ");
        int ai = in.nextInt();
        System.out.print("Enter the marks in DBMS : ");
        int dbms = in.nextInt();
        System.out.print("Enter the marks in Big Data : ");
        int bd = in.nextInt();
        System.out.print("Enter the marks in Blockchain : ");
        int bc = in.nextInt();
        System.out.print("Enter the marks in Microprocessor : ");
        int mp = in.nextInt();

        int total = ai + dbms + bd + bc + mp;
        int Average = total / 5;

        System.out.println(" Total marks :" + total);
        System.out.println(" Average marks :" + Average);

        if (Average >= 90) {
            System.out.println(" Your grade is A. ");

        } else if (Average >= 80) {
            System.out.println("Your grade is B. ");

        } else if (Average >= 60) {
            System.out.println("Your Grade is C.");
        } else if (Average >= 40) {
            System.out.println("Your Grade is D");

        } else if (Average < 40) {
            System.out.println("You have failed this course!");
        } else {
            System.out.println("Invalid Input!!");
        }

        in.close();
    }
}