//Print the largest of 3 numbers :

import java.util.Scanner;

public class B3_Que2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter value of A = ");
        int A = sc.nextInt();

        System.out.print("Enter value of B = ");
        int B = sc.nextInt();
        
        System.out.print("Enter value of C = ");
        int C = sc.nextInt();

        // Check max 3 numbers
        if ((A >= B) && (A >= C)) {

            System.out.println("The largest number is A = " + A);

        } else if (B >= C) {

            System.out.println("The largest number is B = " + B);

        } else {

            System.out.println("The largest number is C = " + C);

        }
    }
}