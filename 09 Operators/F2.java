// 🔥 Assignment Operators :

/*
Ans : Assignment Operators ka use kisi variable ko value assign(store) karne ke
liye kiya jaata hai.

Operator            Name                        Example             Equivalent To
=                   Assignment                  a = 10              a = 10
+=                  Addition Assignment         a += 5              a = a + 5
-=                  Subtraction Assignment      a -= 5              a = a - 5
*=                  Multiplication Assignment   a *= 5              a = a * 5
/=                  Division Assignment         a /= 5              a = a / 5
%=                  Modulus Assignment          a %= 5              a = a % 5
*/

public class F2 {
    public static void main(String args[]) {

        // Assignment =

        int a = 5;
        int b = 25;
        System.out.println((a = b));

        // Addition Assignment +=

        int A = 26;
        A += 4;
        System.out.println(A);

        // Subtraction Assignment -=

        int B = 5;
        B -= 5;
        System.out.println(B);

        // Multiplication Assignment *=

        int c = 50;
        c *= 4;
        System.out.println(c);

        // Division Assignment /=

        int C = 25;
        C /= 5;
        System.out.println(C);

        // Modulus Assignment %=

        int d = 90;
        d %= 3;
        System.out.println(d);
    }
}