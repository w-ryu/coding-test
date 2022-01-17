package org.cian.exam.coding.baekjoon.level.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back14888_Arthmetic {
    public static int N;
    public static long sum;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static int[] numArr;
    public static int[] codeArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        codeArr = new int[4];
        String[] inputNumArr = br.readLine().split(" ");
        String[] inputCodeArr = br.readLine().split(" ");
        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Integer.parseInt(inputNumArr[i]);
        }
        for(int i = 0 ; i < 4 ; i++) {
            codeArr[i] = Integer.parseInt(inputCodeArr[i]);
        }
        sum = numArr[0];
        arthmetic(1);
        System.out.println(max);
        System.out.println(min);
    }

    public static void arthmetic(int depth) {
        if(depth == N) {
            if(max < sum) max = (int)sum;
            if(min > sum) min = (int)sum;
            sum = numArr[0];
            return;
        }

        for(int i = 0 ; i < 4 ; i++) {
            if(codeArr[i] > 0) {
                codeArr[i]--;
                long preSum = sum;
                switch(i) {
                    case 0 : sum += numArr[depth];
                        break;
                    case 1 : sum -= numArr[depth];
                        break;
                    case 2 : sum *= numArr[depth];
                        break;
                    case 3 :
                        int type = 1;
                        if(sum < 0) type = -1;
                        sum = (Math.abs(sum)/numArr[depth])*type;
                        break;
                }

                arthmetic(depth + 1);
                sum = preSum;
                codeArr[i]++;
            }
        }
    }
}
