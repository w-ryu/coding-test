package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] gArr = new int[N+1];
        for(int i = 1 ; i < N+1 ; i++) {
            gArr[i] = Integer.parseInt(br.readLine());
        }

        int[] totalGArr = new int[N+1];
        totalGArr[1] = gArr[1];
        if(N > 1) {
            totalGArr[2] = gArr[1] + gArr[2];
        }

        for(int i = 3 ; i <= N ; i++) {
            totalGArr[i] = Math.max(
                    totalGArr[i-1],Math.max(totalGArr[i-2] + gArr[i], totalGArr[i-3] + gArr[i-1] + gArr[i]));
        }

        System.out.println(totalGArr[N]);
    }
}

