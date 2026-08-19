//🔥 Switch Statement :

/*
Ans : Ek value ka diffrent case se compare karke, matching case ka code executr karna.

📌 Syntax :
    switch(variable) {
    
    case1 :
    
    case2 :
    
    case3 :
    
    defult :
    
    }
*/

import java.util.Scanner;

public class D3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Select number for order food : ");
        int number = sc.nextInt();

        // Check food according to selected number
        switch (number) {
            case 1:
                System.out.println("Samosa");
                break;

            case 2:
                System.out.println("Panir");
                break;

            case 3:
                System.out.println("Chilli");
                break;

            default:
                System.out.println("Invalid selection");
        }
    }
}