// 🔥 Relational Operators :

/*
Relational Operators ka use do values/variables ko compare karne ke liye kiya
jaata hai.

Note : ye compare karne ke always boolean result true ya false deta hai.

Types of Relational Operators :

Operator        Name                            Meaniang
==              Equal to                        Barabar hai
!=              Not eqal to                     Barabar nahi hai
>               Greater than                    Se bada hai
<               Less than                       Se chhota hai
>=              Greater than or equal to        Bada yaa barabar
<=              Less than or equal to           Chhota ya barabar
*/

public class D3 {
    public static void main(String arg[]) {

        //Equal to

        int A = 10;
        int B = 5;
        System.out.println((A == B));
        
        int a = 4;
        int b = 4;
        System.out.println((a == b));

        //Not equal to

        int C = 20;
        int D = 20;
        System.out.println((C != D));

        int c = 30;
        int d = 35;
        System.out.println((c != d));

        //Greater than

        int E = 45;
        int F = 30;
        System.out.println((E > F));

        int e = 39;
        int f = 50;
        System.out.println((e > f));

        //Less than

        int G = 77;
        int H = 99;
        System.out.println((G < H));

        int g = 33;
        int h = 19;
        System.out.println((g < h));

        //Greater than or equal to

        int I = 20;
        int J = 15;
        System.out.println((I >= J));

        int i = 10;
        int j = 15;
        System.out.println((i >= j));

        //Less than or equal to

        int K = 30;
        int L = 25;
        System.out.println((K <= L));

        int k = 36;
        int l = 50;
        System.out.println((k <= l));
    }
}