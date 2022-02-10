package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
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
                }
            }
        }

        System.out.println(sb);
    }
}

