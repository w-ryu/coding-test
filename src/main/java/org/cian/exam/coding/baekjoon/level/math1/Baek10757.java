package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] arrayStr = br.readLine().split(" ");
        char[] charArrayA = arrayStr[0].toCharArray();
        char[] charArrayB = arrayStr[1].toCharArray();
        int arraySize = charArrayA.length + 1;
        if(charArrayA.length < charArrayB.length) {
            arraySize = charArrayB.length + 1;
        }

        int[] arrayInt = new int[arraySize];

        int up = 0;

        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < arraySize ; i++) {
            int A = 0;
            int B = 0;
            int sum = up;

            if(charArrayA.length > i){
                A = charArrayA[charArrayA.length - 1 - i] - 48;
            }
            if(charArrayB.length > i) {
                B = charArrayB[charArrayB.length - 1 - i] - 48;
            }

            sum += A + B;

            if(A + B == 0 && sum == 1){
                arrayInt[arraySize -1 - i] = sum;
                up = 0;
            }else if(sum >= 10) {
                up = 1;
                arrayInt[arraySize -1 - i] = sum % 10;
            }else {
                up = 0;
                arrayInt[arraySize -1 - i] = sum;
            }

            sum = 0;
        }
        for (int i = 0 ; i < arrayInt.length ; i++) {
            if(i == 0){
                if(arrayInt[0] == 0){
                    continue;
                }
            }
            sb.append(arrayInt[i]);

        }
        System.out.println(sb);
    }
}
