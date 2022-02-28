package org.cian.exam.coding.baekjoon.level.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [약수] 완 / 실버5 / 14260KB / 120ms / 735B
 */
public class Baek1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] numArr = new int[A];
        for(int i = 0 ; i < A ; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
        }

        Arrays.sort(numArr);

        if(A % 2 == 1) {
            System.out.println((int)Math.pow(numArr[A/2],2));
        }else {
            System.out.println(numArr[0] * numArr[A-1]);
        }
    }
}
