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
        long[][] numArr = new long[N + 1][10];
        long result = 0;
        int mod = 1000000000;

        for (int i = 1; i < 10; i++) {
            numArr[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    numArr[i][j] = numArr[i - 1][1] % mod;
                } else if (j == 9) {
                    numArr[i][j] = numArr[i - 1][8] % mod;
                } else {
                    numArr[i][j] = numArr[i - 1][j - 1] + numArr[i - 1][j + 1] % mod;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            result += numArr[N][i];
        }

        System.out.println(result % mod);
    }
}
