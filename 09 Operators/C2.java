//🔥 Unary Operators :

/*
Ans : Unary Operator wo operator hai jo sirf ek operand/variable par operation perform karta hai.

Example :
    ++, --

Types of Unary Operators :
1. Increment Operators (++) :

    Types of Increment :
    1. Pre Increment → ++a

    Means : Pahle increment
    ◇ Value Chenge
    ◇ Value use

    2. Post Increment → a++

    Means : Pahle use, baad me increment
    ◇ Value use
    ◇ Value chenge

2. Decrement Operators (--) :

    Types of Decrement :
    1. Pre Decrement → --a

    Means : Pahle Decrement
    ◇ Value chenge
    ◇ Value use

    2. Post Decrement → a--

    Means : Pahle use, Baad me decrement
    ◇ Value use
    ◇ Value chenge
*/

public class C2 {
    public static void main(String args[]) {

        // Pre Increment

        int a = 10;
        int b = ++a;
        System.out.println("Pre Increment");
        System.out.println(a);
        System.out.println(b);

        // Post Increment

        int c = 10;
        int d = c++;
        System.out.println("Post Increment");
        System.out.println(c);
        System.out.println(d);

        // Pre Decrement

        int e = 10;
        int f = --c;
        System.out.println("Pre decrement");
        System.out.println(e);
        System.out.println(f);

        // Post Decrement

        int g = 10;
        int h = g--;
        System.out.println("Post Decrement");
        System.out.println(g);
        System.out.println(h);
    }
}