package org.cian.exam.coding.baekjoon.level.foundation1.dynamic_401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [정수 삼각형] 완 / 실버1 / 28184KB / 304ms / 1265B
 * DP
 */
public class Baek1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] numArr = new int[N+1][N+1];
        int max = 0;
        for(int i = 1 ; i <= N ; i++) {
            String[] inputArr = br.readLine().split(" ");
            int length = inputArr.length;
            for(int j = 1 ; j <= length ; j++) {
                numArr[i][j] = Integer.parseInt(inputArr[j-1]);
            }
        }

        if(N == 1){
            max = numArr[1][1];
        }

        for(int i = 2 ; i <= N ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                if(j == 1) {
                    numArr[i][j] += numArr[i-1][j];
                }else if(j == i) {
                    numArr[i][j] += numArr[i-1][j-1];
                }else {
                    numArr[i][j] += Math.max(numArr[i-1][j], numArr[i-1][j-1]);
                }
                if(i == N && max < numArr[i][j]) {
                    max = numArr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
