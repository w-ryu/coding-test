package org.cian.exam.coding.baekjoon.level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strNM = br.readLine().split(" ");
        int N = Integer.parseInt(strNM[0]);
        int M = Integer.parseInt(strNM[1]);

        String[] strCard = br.readLine().split(" ");
        int[] cardArr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            cardArr[i] = Integer.parseInt(strCard[i]);
        }

        Arrays.sort(cardArr);
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < N-2 ; i++) {
            for(int j = i+1 ; j < N-1 ; j++) {
                for(int k = j+1 ; k < N ; k++){
                    sum = cardArr[i] + cardArr[j] + cardArr[k];

                    if(M >= sum && sum >= max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
