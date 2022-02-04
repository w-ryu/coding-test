package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [연속합] 26804KB / 284ms / 860B / 완 - 다시
 * DP
 * 점화식 -> 재귀 또는 for문 공식 구현 -> 메모이제이션
 * Bottom-up으로 구현
 * Top-down 방식 구현 [다시]
 */
public class Baek1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        long[] numArr = new long[N];
        long[] totalArr = new long[N];
        long max = -1000L;

        for(int i = 0 ; i < N ; i++) {
            numArr[i] = totalArr[i] = Integer.parseInt(inputArr[i]);
            max = numArr[i] > max ? numArr[i] : max;
        }

        for(int i = 1 ; i < N ; i++) {
            totalArr[i] = Math.max(numArr[i] + totalArr[i-1], numArr[i]);
            max = totalArr[i] > max ? totalArr[i] : max;
        }

        System.out.println(max);
    }
}
