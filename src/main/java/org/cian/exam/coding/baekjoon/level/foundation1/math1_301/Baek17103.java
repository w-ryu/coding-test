package org.cian.exam.coding.baekjoon.level.foundation1.math1_301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [골드바흐 파티션]
 */
public class Baek17103 {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            sb.append(primeCnt(Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.println(sb);
        long afterTime = System.currentTimeMillis();
        System.out.println("시간차이(m) : " + (afterTime - beforeTime));
    }

    public static int primeCnt(int n) {
        boolean[] primeArr = new boolean[n + 1];
        primeArr[0] = primeArr[1] = true;
        for(int i = 2 ; i <= (int)Math.sqrt(n) ; i++) {
            if(primeArr[i]) {
                continue;
            }
            for(int j = i * 2 ; j <= n ; j += i) {
                primeArr[j] = true;
            }
        }

        int count = 0;
        for(int j = 2 ; j <= n/2 ; j++) {
            if(primeArr[j] || primeArr[n-j]) {
                continue;
            }
            count++;

        }
        return count;
    }
}
