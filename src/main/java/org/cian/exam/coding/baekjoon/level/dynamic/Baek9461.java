package org.cian.exam.coding.baekjoon.level.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * [파도반 수열] - 완
 */
public class Baek9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[] numArr;
        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            if(N <= 3) {
                sb.append(1).append("\n");
                continue;
            }else if(N == 4) {
                sb.append(2).append("\n");
                continue;
            }else {
                numArr = new long[N+1];
                numArr[1] = numArr[2] = numArr[3] = 1;
                numArr[4] = 2;

                for(int j = 5 ; j <= N ; j++) {
                    numArr[j] = numArr[j-1] + numArr[j-5];
                }
                sb.append(numArr[N]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
