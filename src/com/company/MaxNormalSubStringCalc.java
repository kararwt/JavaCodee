package com.company;
/*
 * k0r02ds
 * created on 22/09/2021
 */


import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

final public class MaxNormalSubStringCalc {

    static int maxNormalSubString(char[] P, char[] Q,
                                  int K, int N) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < Q.length; i++) {
            if (Q[i] == '0') {
                int toBeAdded = (char) i + 'a';
                set.add((char) toBeAdded);
            }
        }
        int count;
        int result = 0;
        StringBuilder sb = null;
        for (int i = 0; i < P.length; i++) {
            for (int j = i; j < P.length; j++) {
                sb = new StringBuilder();
                count = 0;
                for (int k = i; k <= j; k++) {
                    sb.append(P[k]);
                    if (set.contains(P[k])) {
                        count++;
                    }
                }

                //System.out.println(sb);
                if (count <= K) {
                    if (sb.length() > result)
                        result = sb.length();
                }
            }
        }
        return result;
    }

    public static void main(String... args) throws IOException {
        String P = "giraffe", Q = "01111001111111111011111111";
        int K = 2;
        int N = P.length();
        System.out.print(maxNormalSubString(P.toCharArray(), Q.toCharArray(), K, N));

    }
}