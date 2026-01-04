package com.gaurav.operators;

public class OperatorsTrickyQuestions {

    public static void main(String[] args) {

        // ===============================
        // BASIC (1–5)
        // ===============================

        // Q1
        int a = 5;
        System.out.println(a++);
        // Post-increment: print first, then increase

        // Q2
        int b = 5;
        System.out.println(++b);
        // Pre-increment: increase first, then print

        // Q3
        int c = 10;
        System.out.println(c--);

        // Q4
        int d = 10;
        System.out.println(--d);

        // Q5
        int e = 5;
        System.out.println(+e);


        // ===============================
        // MEDIUM (6–10)
        // ===============================

        // Q6
        int x = 5;
        int y = x++ + ++x;
        System.out.println(y);
        // 5 + 7

        // Q7
        int m = 10;
        int n = m-- + --m;
        System.out.println(n);
        // 10 + 8

        // Q8
        int p = 4;
        System.out.println(p++ * 2);

        // Q9
        int q = 6;
        System.out.println(q-- / 2);

        // Q10
        int r = 5;
        System.out.println(r++ + r++);
        // 5 + 6


        // ===============================
        // HARD (11–15)
        // ===============================

        // Q11
        int i = 5;
        int j = 3;
        int k = ++i * j--;
        System.out.println(k);
        // 6 * 3

        // Q12
        int u = 8;
        int v = 2;
        int w = u / v + u--;
        System.out.println(w);
        // 4 + 8

        // Q13
        int g = 4;
        int h = g++ + g++ * 2;
        System.out.println(h);
        // 4 + (5*2)

        // Q14
        int s = 10;
        int t = --s + s++;
        System.out.println(t);
        // 9 + 9 = 18

        // Q15
        int aa = 5;
        int bb = 2;
        System.out.println(aa > bb && aa++ > 5);
        // aa++ is executed because (5 > 2) is true, but (5 > 5) is false. aa becomes 6.


        // ===============================
        // VERY ADVANCED (16–20)
        // ===============================

        // Q16
        int a1 = 5, b1 = 2, c1 = 6, d1 = 3;
        int res1 = ++a1 * --c1 / (--b1 - d1--);
        System.out.println(res1);

        // Q17
        int x1 = 4, y1 = 2, z1 = 2;
        int res2 = ++x1 / --y1 * (--z1 + ++y1);
        System.out.println(res2);

        // Q18
        int k1 = 7;
        System.out.println(k1++ + ++k1 - k1--);

        // Q19
        int m1 = 3;
        int n1 = 4;
        int res3 = m1++ * --n1 + n1--;
        System.out.println(res3);

        // Q20 (Ternary + increment)
        int t1 = 5;
        int t2 = 10;
        int max = (t1++ > t2) ? t1 : t2++;
        System.out.println(max);
    }
}