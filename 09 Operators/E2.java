//🔥 Logical Operators :

/*
Ans : Logical Condition ko  do ya do se jyada condition ko combine karne ke liye hota hai.

Types of logical operators

Operator            Name                Meaning
&&                  Logical AND         Dono combination true honi chahiye
||                  Logical OR          At least one conditon true honi chahiye
!                   Logical NOT         Result ko opposite kar deta hai

1. && (Logical AND) :

Ans : Logical Operator && tab true return karta hai jab dono condition true ho.

Truth Table :

Candition 1             Condition 2             Result
true                    true                    true
true                    false                   false
false                   true                    false
false                   false                   false

2. || (Logical OR) :

Ans : Logical OR operator || tab true return karta hai jab tak at least one condition true ho.

Truth taable :

Candion 1               Condition 2             Result
true                    true                    true
true                    false                   true
false                   true                    true
false                   false                   false

3. ! (Logical NOT) :

Ans : Logical NOT operators kisi boolean result ko reverse/opposit kar deta hai.

Truth tabe :

Condition 1             Result
true                    false
false                   true

*/

public class E2 {
    public static void main(String args[]) {

        // Logical AND &&

        int a = 25;
        int b = 10;
        int c = 35;
        System.out.println((a > b) && (c > a));
        System.out.println((c > a) && (b > a));
        System.out.println((b > c) && (c > b));
        System.out.println((a > c) && (b > c));

        // Logical OR ||

        int A = 78;
        int B = 33;
        int C = 16;
        System.out.println((A > C) || (A > B));
        System.out.println((A > C) || (B > A));
        System.out.println((C > A) || (B > C));
        System.out.println((C > B) || (C > A));

        // Logical NOT !

        int d = 23;
        int e = 25;
        System.out.println( !(e > d) );
        System.out.println( !(d > e) );
    }
}