package org.cian.exam.coding.baekjoon.level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ctor = 0;
        for(int i = 1 ; i <= N ; i++) {
            if(N == sum(i) + i) {
                ctor = i;
                break;
            }
        }
        System.out.println(ctor);
    }

    static int sum(int N) {
        if(N < 10) {
            return N;
        }
        return sum(N/10) + N%10;
    }
}
