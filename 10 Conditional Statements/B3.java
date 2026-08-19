//🔥 else if Statement :

/*
else if ka use tab hota hai jab hume multiple conditions ko check karna ho.

Syntax :
    if(condition 1) {

    }
    else if(condition 2) {
    
    }
    else {
        
    }
*/

import java.util.Scanner;

public class B3 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        // Input marks from user
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        // Check Grade
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}