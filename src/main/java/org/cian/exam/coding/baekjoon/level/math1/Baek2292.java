package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = 0;
        int result = 0;
        if(N == 1) {
            result = 1;
        }else {
            while(A < N) {
                int B = (3 * A * (A + 1)) + 1;
                int C = (3 * (A + 1) * (A + 2)) + 1;
                if(B < N && N <= C) {
                    result = A + 2;
                    break;
                }
                A++;
            }
        }
        System.out.println(result);
    }
}
