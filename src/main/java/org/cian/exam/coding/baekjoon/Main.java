package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static long max = Integer.MIN_VALUE;
    public static long min = Integer.MAX_VALUE;
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        String[] codeStrArr = br.readLine().split(" ");
        int[] numArr = new int[N];
        int[] codeArr = new int[4];
        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        for(int i = 0 ; i < 4 ; i++) {
            codeArr[i] = Integer.parseInt(codeStrArr[i]);
        }
        mathMethod(numArr, codeArr, numArr[0], 1);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static void mathMethod(int[] numArr, int[] codeArr, long sum, int depth) {
        if(depth == N-1) {
            for(int i = 0 ; i < 4 ; i++){
                if(codeArr[i] == 1) {
                    switch(i) {
                        case 0 :
                            sum += numArr[depth];
                            break;
                        case 1 :
                            sum -= numArr[depth];
                            break;
                        case 2 :
                            sum *= numArr[depth];
                            break;
                        case 3 :
                            sum /= numArr[depth];
                            break;
                    }
                }
            }
            if(max < sum) max = sum;
            if(min > sum) min = sum;
        }
    }
}

