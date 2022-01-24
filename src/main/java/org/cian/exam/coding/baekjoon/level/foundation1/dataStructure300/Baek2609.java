package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [최대공약수와 최소공배수]
 */
public class Baek2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputArr = br.readLine().split(" ");
        Arrays.sort(inputArr);
        int A = Integer.parseInt(inputArr[0]);
        int B = Integer.parseInt(inputArr[1]);
        int max = Integer.MIN_VALUE;

        for(int i = 1 ; i <= A ; i++){
            if(A % i == 0 && B % i == 0) {
                max = i;
            }
        }
        System.out.println(max);
        for(int i = B ; i <= A*B ; i++) {
            if(i % A == 0 && i % B == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
