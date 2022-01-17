package org.cian.exam.coding.baekjoon.level.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10872 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 1; i <= N ; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
