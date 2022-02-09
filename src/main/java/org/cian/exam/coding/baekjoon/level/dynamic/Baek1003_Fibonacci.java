package org.cian.exam.coding.baekjoon.level.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1003_Fibonacci {
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            if(i != T-1) sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void fibonacci(int n) {
        if(n == 0) {
            sb.append(1).append(" ").append(0);
            return;
        }else if(n == 1) {
            sb.append(0).append(" ").append(1);
            return;
        }else if(n == 2) {
            sb.append(1).append(" ").append(1);
            return;
        }

        long n1 = 0;
        long n2 = 1;
        long sum = 0;
        for(int i = 0 ; i < n ; i++) {
            if(i == n-2) {
                sb.append(sum).append(" ");
            }else if(i == n-1){
                sb.append(sum);
            }
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        return;
    }
}
