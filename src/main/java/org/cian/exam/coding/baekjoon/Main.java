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

            long[] numArr = new long[N+1];
            numArr[0] = 1;
            numArr[1] = 2;
            if(N == 1) {
                sb.append(numArr[0]).append("\n");
                continue;
            }
            numArr[2] = 4;

            for(int j = 3 ; j < N ; j++) {
                numArr[j] = (numArr[j-1] + numArr[j-2] + numArr[j-3]) % 1000000009;
            }
            sb.append(numArr[N-1]).append("\n");
        }

        System.out.println(sb);
    }
}

