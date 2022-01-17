package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baek1427 {
    static int[] intArr;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        intArr = new int[10];
        count = 0;
        numSplit(N);
        Integer[] resultArr = new Integer[count + 1];

        for(int i = 0 ; i <= count ; i++) {
            resultArr[i] = intArr[i];
        }

        Arrays.sort(resultArr, Collections.reverseOrder());

        for(int a : resultArr){
            System.out.print(a);
        }
    }

    static void numSplit(int N) {

        if(N < 10) {
            intArr[count] = N;
            return;
        }

        intArr[count] = N % 10;
        N /= 10;
        count++;
        numSplit(N);
    }
}
