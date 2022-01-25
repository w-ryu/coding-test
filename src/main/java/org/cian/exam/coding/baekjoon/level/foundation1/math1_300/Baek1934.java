package org.cian.exam.coding.baekjoon.level.foundation1.math1_300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [최소공배수]
 */

public class Baek1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++) {
            String[] inputArr = br.readLine().split(" ");
            Arrays.sort(inputArr);
            int A = Integer.parseInt(inputArr[0]);
            int B = Integer.parseInt(inputArr[1]);

            for(int j = B ; j <= A*B ; j++) {
                if(j % A == 0 && j % B == 0) {
                    sb.append(j).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
