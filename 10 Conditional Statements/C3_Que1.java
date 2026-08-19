//Check if a student will Pass or fail :

import java.util.Scanner;

public class C3_Que1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter marks = ");
        int marks = sc.nextInt();

        // Check Pass or Fail using Ternary Operator
        String Type = (marks >= 30) ? "Pass" : "Fail";

        // Output
        System.out.println(Type);
    }
}