//Print if a number is Odd or Even :

import java.util.Scanner;

public class A3_Que_02 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number : ");
        int Number = sc.nextInt();

        // Check number Odd or Even
        if(Number % 2 == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }
    }
}