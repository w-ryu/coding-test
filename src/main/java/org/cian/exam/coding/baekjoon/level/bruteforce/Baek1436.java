package org.cian.exam.coding.baekjoon.level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * [영화감독 슘] 실버5 - 완
 */
public class Baek1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] numArr = new boolean[2700001];

        for(int i = 666 ; i <= 2700000; i++) {
            if(String.valueOf(i).contains("666")) {
                numArr[i] = true;
                N--;
            }
            if(N == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
