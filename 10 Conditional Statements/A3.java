//🔥 Conditional Statement :

/*
Ans : Conditional Statement ka use program me condition check karne ke liye hota hai.

Agar condition True hai → ek particular execute hoga.
Agar condition false hai → dusra code execute ho sakta hai.

Types of Condition al Statement :

1. if-else Statement :

Agar condition TRUE hai → if wala code chalega
Agar condition FALSE hai → else vala code chalega

*/

public class A3 {
    public static void main(String args[]) {

        // if else Statement

        int age = 17;

        if (age >= 18) {
            System.out.println("Adult man : Drive, Vote");
        }

        if (age > 16 && age < 18) {
            System.out.println("Teeniger");
        }

        else {
            System.out.println("Not adult man");
        }
    }
}