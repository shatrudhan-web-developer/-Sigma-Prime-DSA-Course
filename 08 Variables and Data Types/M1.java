//Area of circle :

/*
Formula : π × r × r
*/

import java.util.Scanner;

public class M1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of radius = ");
        float r = sc.nextInt();

        float circle = 3.14f*r*r;

        System.out.println("Area of circle = " + circle);
    }
}

