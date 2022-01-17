package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int n = Integer.parseInt(br.readLine());
            int A = n;
            int B = 0;

            Boolean[] prime = new Boolean[n + 1];
            Arrays.fill(prime, Boolean.FALSE);

            prime[0] = prime[1] = true;

            for(int j = 2 ; j < Math.sqrt(prime.length) ; j++){
                if(prime[j]){
                    continue;
                }
                for(int k = j * j ; k < prime.length ; k = k + j ) {
                    prime[k] = true;
                }
            }

            for(int j = 1 ; j <= n / 2 ; j++) {
                if(prime[j]) {
                    continue;
                }
                if(prime[n - j]) {
                    continue;
                }
                A = j;
                B = n - j;

            }
            System.out.println(A + " " + B);
        }
    }
}
