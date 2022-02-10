package org.cian.exam.coding.baekjoon.level.foundation1.math1_301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [-2진수] 미완/다시
 *
 */
public class Baek2089_nonSuccess {
    public static int[] biArr;
    public static int N;
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int count = 0;

        if(N == 0) {
            sb.append(0);
        }else if(N < 0) {
            count = 1;
            while((N / (int)Math.pow(-2, count)) > 0) {
                count += 2;
            }
        }else {
            while((N / (int)Math.pow(-2, count)) > 0) {
                count += 2;
            }
        }

        biArr= new int[count+1];
        biArr[0] = 1;
        changeBinary(0, count);
        System.out.println(sb);
    }

    public static void changeBinary(int num, int p) {
        int biArrLength = biArr.length;
        if(N == num) {
            for(int i = 0 ; i < biArrLength ; i++) {
                sb.append(biArr[i]);
            }
        }

        for(int i = 1 ; i < biArrLength - 1 ; i++) {
            if(i / 2 == 0) {
                num += (int)Math.pow(2, i);
            }else {
                num += (int)Math.pow(2, i);
            }
        }

    }
}
