package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [제곱수의 합] 14732KB / 168ms / 603B / 완 - 다시
 * DP
 * Bottom-up으로 구현
 * N-i^2 + 1 점화식 사용
 */
public class Baek1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] minArr = new int[N+1];

        for(int i = 1 ; i <= N ; i++) {
            minArr[i] = i;
            for(int j = 1 ; j*j <= i ; j++) {
                minArr[i] = Math.min(minArr[i], minArr[i - (j*j)] + 1);
            }
        }

        System.out.println(minArr[N]);
    }
}
