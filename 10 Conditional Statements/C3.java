//🔥 Ternary Operators :

/*
Ans : Ternary Operator ek short form of if-else hai.

📌 Syntax :
    variable  = condition? statement1 : statement2;
*/

import java.util.Scanner;

public class C3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Number : ");
        int Number = sc.nextInt();

        // Check Odd or Even using Ternary Operator
        String Type = (Number % 2) == 0 ? "Even" : "Odd";

        // Output
        System.out.println(Type);
    }
}