package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
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

