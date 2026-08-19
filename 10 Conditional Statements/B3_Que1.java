//Income Tax Calculator :

/*
Income < 5L → 0% tax
Income brtween 5L to 10L → 20% tax
Income 10L → 30% tax 
*/

import java.util.Scanner;

public class B3_Que1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int tax;

        // Income from user
        System.out.print("Enter your income = ");
        int income = sc.nextInt();

        if (income < 500000) {
            tax = 0;
            System.out.println("Your tax = " + tax);
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
            System.out.println("Your tax = " + tax);
        } else {
            tax = (int) (income * 0.3);
            System.out.println("Your tax = " + tax);
        }
    }
}