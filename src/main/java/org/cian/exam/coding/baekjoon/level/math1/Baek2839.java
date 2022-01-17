package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int big = N / 5;
        int small = N / 3;
        int cnt = 0;
        if(N % 5 == 0) {
            System.out.println(big);
        }else {
            for(int i = 1 ; i <= small ; i++) {
                if(cnt > 0) {
                    break;
                }
                for(int j = 0 ; j <= big ; j++) {
                    int num = (3 * i) + (5 * j);
                    if(N == num) {
                        cnt++;
                        System.out.println(i + j);
                        break;
                    }else if(N < num) {
                        break;
                    }
                }
            }
            if(cnt == 0) {
                System.out.println(-1);
            }
        }
    }
}
