package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int q = N;

        for(int i = 2 ; i <= N ; i++) {
            while(q % i == 0){
                q = q / i;
                System.out.println(i);
            }
            if(q == 1) {
                break;
            }
        }
    }
}
