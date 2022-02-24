package org.cian.exam.coding.baekjoon.level.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [배수와약수] 완 / 브론즈34 / 14004KB / 120ms / 864B
 */
public class Baek5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] distanceStrArr = br.readLine().split(" ");
        String[] priceStrArr = br.readLine().split(" ");
        long[] distanceArr = new long[N-1];
        long[] priceArr = new long[N];
        long sum = 0;

        for(int i = 0 ; i < N ; i++) {
            int price = Integer.parseInt(priceStrArr[i]);
            if(i > 0 && priceArr[i-1] < price) {
                priceArr[i] = priceArr[i-1];
            }else {
                priceArr[i] = price;
            }
            if(i < N-1 ) {
                distanceArr[i] = Integer.parseInt(distanceStrArr[i]);
            }
        }

        for(int i = 0 ; i < N-1 ; i++) {
            sum += priceArr[i] * distanceArr[i];
        }
        System.out.println(sum);
    }
}
