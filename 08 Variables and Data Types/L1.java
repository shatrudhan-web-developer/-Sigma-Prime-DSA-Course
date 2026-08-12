//Product of a nad b :

import java.util.Scanner;

public class L1 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a = ");
        int a = sc.nextInt();

        System.out.print("Enter value of b = ");
        int b = sc.nextInt();

        int product = a * b;

        System.out.println("Product of a and b = " + product);
    }
}