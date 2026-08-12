// Type Promotion in Expression :

/*
1. During arithmatic operations, java automatically promotes smaller data types
(byte, short, char) to int.

Example :
    byte + byte → int
    short + short → int
    char + char → int


2. Java expression me agar koi operand long hai, to smaller integer types promote hokar long ho sakta hai.

Example :
    int + long → long
    int + float → float
    int + double → double
*/

public class P1 {
    public static void main(String args[]) {

        // ✅ Correct hai.
        // byte a = 25;
        // byte b = 15;
        // int c = a + b;
        // System.out.println(c);

        // ❌ Ye kyu galat hai?
        // byte a = 10;
        // byte b = 5;
        // byte c = a + b;
        // System.out.println(c);

        /*
        Kyuki a + b → int hota hai
        
        Aur int ko automatacally byte me convert nahi kiya jaa sakta hai.
        
        Agar karna hai
        byte c = (byte)(a + b);
         */

        // byte a = 19;
        // byte b = 11;
        // byte c = (byte)(a + b);
        // System.out.println(c);

        // char a = 'a';
        // char b = 'b';
        // char c = (char)(a * b);
        // int d = a + b;
        // System.out.println(c);
        // System.out.println(d);

        // short a = 12;
        // short b = 12;
        // short c = (short) (a + b);
        // int d = a * b;
        // System.out.println(c);
        // System.out.println(d);

        // int a = 10;
        // long b = 12;
        // long c = a + b;
        // System.out.println(c);

        // int a = 13;
        // float b = 2.5f;
        // float c = a * b;
        // System.out.println(c);

        int a = 23;
        double b = 13.5;
        double c = a + b;
        System.out.println(c);
    }
}