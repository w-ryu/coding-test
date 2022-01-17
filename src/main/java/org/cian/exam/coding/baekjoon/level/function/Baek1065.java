package org.cian.exam.coding.baekjoon.level.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int result = 0;

        if(N < 100) {
            result = N;
        }else{
            for(int i = 100 ; i <= N ; i++) {
                int first = ((i % 1000) / 100) - ((i % 100) / 10);
                int second = ((i % 100) / 10) - (i % 10);

                if(first == second){
                    cnt ++;
                }
            }
            result = 99 + cnt;
        }

        if(N == 1000){result -= 1;}

        System.out.println("result = " + result);
    }
}
