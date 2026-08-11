//Sum of a and b (Input from User) :

import java.util.Scanner;

public class K1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of a and b = " + sum);
    }
}