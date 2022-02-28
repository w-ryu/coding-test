package org.cian.exam.coding.baekjoon.level.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [동전O] 완 / 실버3 / 14236KB / 124ms / 877B
 */
public class Baek11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int T = Integer.parseInt(inputArr[0]);
        int price = Integer.parseInt(inputArr[1]);
        int[] coinArr = new int[T];
        int count = 0;

        for(int i = 0 ; i < T ; i++) {
            coinArr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = T-1 ; i >= 0 ; i--) {
            if(price == 0) {
                break;
            }

            if(coinArr[i] <= price){
                count += (price / coinArr[i]);
                price %= coinArr[i];
            }
        }

        System.out.println(count);
    }
}
