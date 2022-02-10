package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * [골드바흐의 추측] 완 / 실버1 / 41764KB / 316ms / 1163B
 */
public class Baek9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());

            boolean[] primeArr=  new boolean[N+1];
            primeArr[0] = primeArr[1] = true;

            for(int j = 2 ; j <= (int)Math.sqrt(N) ; j++) {
                if(primeArr[j]) {
                    continue;
                }
                for(int k = j*2 ; k <= N ; k = k+j) {
                    primeArr[k] = true;
                }
            }

            int half = N/2;
            if(N%2 == 1) half++;

            for(int j = half ; j >= 2 ; j--) {
                if(!primeArr[j] && !primeArr[N - j]) {
                    sb.append(j).append(" ").append(N-j).append("\n");
                    break;
                }            }
        }

        System.out.println(sb);
    }

    /**
     * 118276KB / 636ms / 1240B
     * 3달 전 소스
     */
    void before() throws IOException {
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

