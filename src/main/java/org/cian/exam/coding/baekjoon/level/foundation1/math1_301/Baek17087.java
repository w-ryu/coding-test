package org.cian.exam.coding.baekjoon.level.foundation1.math1_301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [숨바꼭지6] - 다시
 * - 문제가 햇갈림...
 * - gcd로 풀어야함 (최대공약수 문제)
 */
public class Baek17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ns = br.readLine().split(" ");
        int N = Integer.parseInt(ns[0]);
        int S = Integer.parseInt(ns[1]);

        String[] inputArr = br.readLine().split(" ");
        int[] numArr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Math.abs(Integer.parseInt(inputArr[i]) - S);
        }

        int D = numArr[0];
        if(N > 1) {
            for(int i = 1 ; i < N ; i++) {
                int num = gcd(numArr[i-1], numArr[i]);
                if(D > num){
                    D = num;
                }
            }
        }
        System.out.println(D);
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }else {
            return gcd(b, a % b);
        }
    }
}
