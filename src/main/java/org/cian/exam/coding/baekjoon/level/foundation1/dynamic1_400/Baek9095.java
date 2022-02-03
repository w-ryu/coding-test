package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [1,2,3 더하기] 실버3 / 14536KB / 144ms / 825B / 다시
 * DP bottom -> top
 */
public class Baek9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] numArr = new int[N+1];
            numArr[0] = numArr[1] = 1;
            if(N <= 2) {
                sb.append(N).append("\n");
                continue;
            }
            numArr[2] = 2;
            for(int j = 3 ; j <= N ; j++) {
                numArr[j] = numArr[j-1] + numArr[j-2] + numArr[j-3];
            }
            sb.append(numArr[N]).append("\n");
        }
        System.out.println(sb);
    }
}
