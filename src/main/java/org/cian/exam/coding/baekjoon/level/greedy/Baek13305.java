package org.cian.exam.coding.baekjoon.level.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * [주유소] 완 / 실버4 / 100점 / 39436KB / 424ms / 1056B
 */
public class Baek13305 {
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
