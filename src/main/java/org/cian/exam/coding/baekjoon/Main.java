package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
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

