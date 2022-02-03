package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [카드 구매하기] 실버1 / 14536KB / 144ms / 825B / 미완-다시
 * DP bottom -> top
 */
public class Baek11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] cardArr = new int[N+1];
        int[] maxArr = new int[N+1];

        for(int i = 1 ; i <= N ; i++) {
            cardArr[i] = Integer.parseInt(inputArr[i-1]);
        }

        for(int i = 1 ; i <= N ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                maxArr[i] = Math.max(maxArr[i], maxArr[i-j] + cardArr[j]);
            }
        }
        System.out.println(maxArr[N]);
    }
}
