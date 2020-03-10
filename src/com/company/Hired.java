package com.company;

import static java.lang.Math.*;

public class Hired {
    public static String solution(String[] records) {
        // Type your solution here
        String output = "";
        int number = 0;
        int sz = records.length;
        for (int i = 0; i < sz; i++) {
            String[] rec = records[i].split(",");
            int num = abs(Integer.parseInt(rec[3]));
            number += num;
            if (i == sz - 1) output = rec[1];
        }

        return output + ", " + number;
    }

    public static int sum;

    public static long solution(long max) {
        sum = 0;
//        System.out.println(fib2(34));
        return(fib2(34, 0));
    }

    private static long fibcount(long n, long n1, long sum, long max) {
        if (n1 == max) return sum;
        long this_num = n + n1;
        return sum + fibcount(n1, this_num, sum, max);
    }

    static long fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }


    static long fib2(int n, int sum)
    {
//        if(n % 2 == 0) sum += n;
        if (n <= 1)
            return sum;
        if (n % 2 == 0) sum += n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
//        solution(34);
//        System.out.println(
//        fib(9));'
        System.out.println(solution(34));
        String a = "ggs";
        String b = "set";
        System.out.println(a.equals(b));
    }
}
