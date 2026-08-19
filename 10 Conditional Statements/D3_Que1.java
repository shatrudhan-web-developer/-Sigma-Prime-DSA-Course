//Calculator :

import java.util.Scanner;

public class D3_Que1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter value of A : ");
        int A = sc.nextInt();

        System.out.print("Enter value of B : ");
        int B = sc.nextInt();

        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);

        // Calculate
        switch (operator) {
            case '+':
                System.out.println("Sum of A and B = " + (A + B));
                break;

            case '-':
                System.out.println("Difference of A and B = " + (A - B));
                break;

            case '*':
                System.out.println("Multiplication of A and B = " + (A * B));
                break;

            case '/':
                System.out.println("Divide of A and B = " + (A / B));
                break;

            case '%':
                System.out.println("Modulus of A and B = " + (A % B));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}