package org.cian.exam.coding.baekjoon.level.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [피보나치수열] 완 / 실버3 / 14012KB / 132ms / 1027B
 */
public class Baek1003_Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[N+1];
            if(N == 0) {
                sb.append(1).append(" ").append(0).append("\n");
                continue;
            }else if(N == 1) {
                sb.append(0).append(" ").append(1).append("\n");
                continue;
            }

            arr[0] = 1;
            arr[1] = 0;

            for(int j = 2 ; j < N+1 ; j++) {
                arr[j] = arr[j-1] + arr[j-2];
            }

            sb.append(arr[N]).append(" ").append(arr[N] + arr[N-1]).append("\n");
        }
        System.out.println(sb);
    }

//    public static StringBuffer sb = new StringBuffer();
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        for(int i = 0 ; i < T ; i++) {
//            int N = Integer.parseInt(br.readLine());
//            fibonacci(N);
//            if(i != T-1) sb.append("\n");
//        }
//        System.out.println(sb);
//    }
//
//    public static void fibonacci(int n) {
//        if(n == 0) {
//            sb.append(1).append(" ").append(0);
//            return;
//        }else if(n == 1) {
//            sb.append(0).append(" ").append(1);
//            return;
//        }else if(n == 2) {
//            sb.append(1).append(" ").append(1);
//            return;
//        }
//
//        long n1 = 0;
//        long n2 = 1;
//        long sum = 0;
//        for(int i = 0 ; i < n ; i++) {
//            if(i == n-2) {
//                sb.append(sum).append(" ");
//            }else if(i == n-1){
//                sb.append(sum);
//            }
//            sum = n1 + n2;
//            n1 = n2;
//            n2 = sum;
//        }
//
//        return;
//    }
}
