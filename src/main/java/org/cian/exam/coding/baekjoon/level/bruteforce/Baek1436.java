package org.cian.exam.coding.baekjoon.level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 666 ; i < 1000000 ; i++) {
            String str = String.valueOf(i);
            if(str.contains("666")){
                count++;
            }
            if(count == N) {
                System.out.println(i);
                break;
            }
        }
    }
}
