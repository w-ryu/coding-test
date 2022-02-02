package org.cian.exam.coding.baekjoon.level.foundation1.bruteforce_500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [일곱난쟁이] 14176KB / 124ms / 1179B
 */
public class Baek2309 {
    public static int[] numArr = new int[9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 9 ; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);
        munchikin();

        for(int i = 0 ; i < 9 ; i++) {
            if(numArr[i] > 0) {
                sb.append(numArr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void munchikin() {

        int totalSize = 0;
        for(int i = 0 ; i < 9 ; i++) {
            totalSize += numArr[i];
        }

        for(int i = 0 ; i < 8 ; i++) {
            for(int j = i+1 ; j < 9 ; j++) {
                int size = totalSize - (numArr[i] + numArr[j]);
                if(size == 100) {
                    numArr[i] = numArr[j] = 0;
                    return;
                }
            }
        }
    }
}
