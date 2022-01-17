package org.cian.exam.coding.baekjoon.level.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10870 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] intArray = new int[n+1];

        for(int i = 0 ; i < n+1 ; i++) {
            if(i == 0){
                intArray[i] = 0;
            }else if(i == 1) {
                intArray[i] = 1;
            }else {
                intArray[i] = intArray[i-1] + intArray[i-2];
            }
        }
        System.out.println(intArray[n]);
    }
}
