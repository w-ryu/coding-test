package org.cian.exam.coding.baekjoon.level.foundation1.dynamic_401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [스티커] 131648KB / 700ms / 1327B / 완 - 다시
 * DP로 풀긴했지만, 정확한 점화식을 구현하지 못했음 다시
 *
 */
public class Baek9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());

            int[][] scoreArr = new int[2][N+1];

            for(int j = 0 ; j < 2 ; j++) {
                String[] inputArr = br.readLine().split(" ");
                for(int k = 1 ; k <= N ; k++) {
                    scoreArr[j][k] = Integer.parseInt(inputArr[k-1]);
                }
            }

            int[][] totalScoreArr = new int[2][N+1];

            totalScoreArr[0][1] = scoreArr[0][1];
            totalScoreArr[1][1] = scoreArr[1][1];

            for(int j = 2; j <= N ; j++) {
                totalScoreArr[0][j] = Math.max(totalScoreArr[1][j-1], totalScoreArr[1][j-2]) + scoreArr[0][j];
                totalScoreArr[1][j] = Math.max(totalScoreArr[0][j-1], totalScoreArr[0][j-2]) + scoreArr[1][j];
            }

            sb.append(Math.max(totalScoreArr[0][N], totalScoreArr[1][N])).append("\n");
        }
        System.out.println(sb);
    }
}
