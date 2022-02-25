package org.cian.exam.coding.baekjoon.level.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [최소공배수] 완 / 실버5 / 16052KB / 328ms / 1294B
 */
public class Baek1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String[] inputArr = br.readLine().split(" ");
            int answer = 1;
            int A = Integer.parseInt(inputArr[0]);
            int B = Integer.parseInt(inputArr[1]);

            if(A > B) {
                A = B;
                B = Integer.parseInt(inputArr[0]);
            }

            if(A == 1) {
                sb.append(B).append("\n");
                continue;
            }

            for(int j = 2 ; j <= A ; j++) {
                while(A % j == 0 && B % j == 0){
                    A /= j;
                    B /= j;
                    answer *= j;

                    if(A == 1) {
                        sb.append(answer * B).append("\n");
                        break;
                    }
                }
            }

            if(A > 1) sb.append(answer * A * B).append("\n");

        }
        System.out.println(sb);
    }
}
