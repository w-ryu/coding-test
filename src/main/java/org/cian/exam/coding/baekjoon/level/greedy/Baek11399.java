package org.cian.exam.coding.baekjoon.level.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [ATM] 완 / 실버3 / 14480KB / 156ms / 799B
 */
public class Baek11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] timeArr = new int[N];
        int totalTime = 0;

        for(int i = 0 ; i < N ; i++) {
            timeArr[i] = Integer.parseInt(inputArr[i]);
        }

        Arrays.sort(timeArr);

        for(int i = 1 ; i < N ; i++) {
            timeArr[i] += timeArr[i-1];
        }

        for(int sum : timeArr) {
            totalTime += sum;
        }

        System.out.println(totalTime);
    }
}
