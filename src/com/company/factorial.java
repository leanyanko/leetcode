package com.company;

import java.math.BigInteger;

public class factorial {
    //combination K out of N
    static BigInteger binomial(final int N, final int K) {
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf(N-k))
                    .divide(BigInteger.valueOf(k+1));
        }
        return ret;
    }

    public static void main(String[] args) {
        long s = binomial(4, 3).intValue();
        System.out.println(s);
    }


}
