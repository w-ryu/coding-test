package org.cian.exam.coding.baekjoon.level.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [다리 놓기] - 완/다시
 * 배열처리 다시 해보기
 */
public class Baek1010 {
    static int[][] nArr = new int[31][31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i <= 30 ; i++) {
            nArr[i][0] = 1;
            nArr[i][i] = 1;
            nArr[i][1] = i;
            nArr[i][i-1] = i;
        }

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String[] inputArr = br.readLine().split(" ");
            int N = Integer.parseInt(inputArr[0]);
            int M = Integer.parseInt(inputArr[1]);

            sb.append(combination(M, N)).append("\n");
        }

        System.out.println(sb);
    }

    public static int combination(int n, int r) {
        if(nArr[n][r] > 0) return nArr[n][r];

        return nArr[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }
}
