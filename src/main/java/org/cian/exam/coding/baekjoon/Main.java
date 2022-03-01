package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++) {
            int num = Integer.parseInt(inputArr[i]);
            if(num < 0) num *= -1;
            if(max < num) {
                max = num;
            }
        }

        boolean[][] A = new boolean[2][max+1];

        for(int i = 0 ; i < max ; i++) {
            int num = Integer.parseInt(inputArr[i]);
            if(num < 0) {
                A[0][num] = true;
            }else {
                A[1][num] = true;
            }
        }

        int M = Integer.parseInt(br.readLine());
        inputArr = br.readLine().split(" ");

        for(int i = 0 ; i < M ; i++) {
            int num = Integer.parseInt(inputArr[i]);
            if((num < 0 && (num * -1) > max) || num > max) {
                sb.append(0).append("\n");
            }else if((num < 0 && A[0][num]) || A[1][num]) {
                sb.append(1).append("\n");
            }else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}

