package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = -1;
        int sum = 0;
        if(M == 1) {
            M = 2;
        }

        for(int i = N ; i >= M ; i--) {

            int cnt = 0;
            for(int j = 2 ; j <= i / 2 ; j++) {
                if(i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0){
                min = i;
                sum += i;
            }

        }
        if(sum > 0){
            System.out.println(sum);
        }
        System.out.print(min);
    }
}
