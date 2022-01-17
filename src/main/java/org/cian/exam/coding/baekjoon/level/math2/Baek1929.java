package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] strArray = br.readLine().split(" ");
        int M = Integer.parseInt(strArray[0]);
        int N = Integer.parseInt(strArray[1]);
        StringBuffer sb = new StringBuffer();

        Boolean[] prime = new Boolean[N+1];
        Arrays.fill(prime, Boolean.FALSE);

        if(N > 1){
            prime[0] = prime[1] = true;

            for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++) {
                if(prime[i]) {
                    continue;
                }
                for(int j = i * i ; j < prime.length ; j = j + i) {
                    prime[j] = true;
                }
            }

            for(int i = M ; i < prime.length ; i++) {
                if(!prime[i]) {
                    sb.append(i).append("\n");
                }
            }
            System.out.println(sb);
        }
    }
}
