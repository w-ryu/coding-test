package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [합분해] 14476KB / 128ms / 922B / 완 - 다시
 * DP
 * Bottom-up으로 구현
 * 점화식 작성 연습 필요
 */
public class Baek2225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr[0]);
        int K = Integer.parseInt(inputArr[1]);
        long[][] numArr = new long[K+1][N+1];
        int mod = 1000000000;

        for(int i = 0 ; i <= N ; i++) {
            numArr[1][i] = 1;
        }

        for(int i = 2 ; i <= K ; i++) {
            for(int j = 0 ; j <= N ; j++) {
                if(j == 0) {
                    numArr[i][j] = numArr[i-1][0];
                }else {
                    numArr[i][j] = (numArr[i-1][j] + numArr[i][j-1]) % mod;
                }
            }
        }

        System.out.println(numArr[K][N]);
    }
}
