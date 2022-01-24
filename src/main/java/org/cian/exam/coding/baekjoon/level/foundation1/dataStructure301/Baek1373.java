package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [2진수 8진수]
 */
public class Baek1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] strArr = br.readLine().toCharArray();
        int length = strArr.length;
        int numArrLength = length / 3;
        if(length % 3 > 0) {
            numArrLength ++;
        }

        int[] numArr = new int[numArrLength];
        for(int i = length - 1 ; i >= 0 ; i -= 3) {
            if(i < 2) {
                if(i % 3 == 0) {
                    numArr[i / 3] = strArr[i] - 48;
                }else if(i % 3 == 1) {
                    numArr[i / 3] = (strArr[i] - 48) + ((strArr[i-1] - 48) * 2);
                }
            }else {
                numArr[i / 3] = (strArr[i] - 48) + ((strArr[i-1] - 48) * 2) + ((strArr[i-2] - 48) * 4);
            }
        }

        for(int i = 0 ; i < numArrLength ; i++) {
            sb.append(numArr[i]);
        }
        System.out.println(sb);
    }
}
