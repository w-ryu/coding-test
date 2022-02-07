package org.cian.exam.coding.baekjoon.level.foundation1.dynamic_401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [포도주 시식] 완 - 내머리로 푼거 아님 다시
 * DP
 * Bottom-up
 * 로직을 제대로 이해하고 다시 풀기
 */
public class Baek2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] gArr = new int[N+1];
        for(int i = 1 ; i < N+1 ; i++) {
            gArr[i] = Integer.parseInt(br.readLine());
        }

        int[] totalGArr = new int[N+1];
        totalGArr[1] = gArr[1];
        if(N > 1) {
            totalGArr[2] = gArr[1] + gArr[2];
        }

        for(int i = 3 ; i <= N ; i++) {
            totalGArr[i] = Math.max(
                    totalGArr[i-1],Math.max(totalGArr[i-2] + gArr[i], totalGArr[i-3] + gArr[i-1] + gArr[i]));
        }

        System.out.println(totalGArr[N]);
    }

    /*
     * oox
     * oxo
     * xoo
     * 3가지로 메모이제이션을 이용해서 max 값을 도출하려 했으나,
     * 틀렸다고함...
     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] gArr = new int[N+2];
//        for(int i = 2 ; i <= N+1 ; i++) {
//            gArr[i] = Integer.parseInt(br.readLine());
//        }
//
//        int[][] totalGArr = new int[3][N+2];
//
//        for(int i = 2 ; i < N+1 ; i++) {
////                totalGArr[(i-1)%3][i] = totalGArr[(i-1)%3][i-1];
////                totalGArr[i%3][i] = totalGArr[i%3][i-1] + gArr[i];
////                totalGArr[(i+1)%3][i] = totalGArr[(i+1)%3][i-2] + gArr[i];
//            if(i%3 == 2) {
//                totalGArr[0][i] = totalGArr[0][i-1];
//                totalGArr[1][i] = totalGArr[1][i-1] + gArr[i];
//                totalGArr[2][i] = totalGArr[2][i-2] + gArr[i];
//            }else if(i%3 == 0) {
//                totalGArr[1][i] = totalGArr[1][i-1];
//                totalGArr[2][i] = totalGArr[2][i-1] + gArr[i];
//                totalGArr[0][i] = totalGArr[0][i-2] + gArr[i];
//            }else {
//                totalGArr[2][i] = totalGArr[2][i-1];
//                totalGArr[0][i] = totalGArr[0][i-1] + gArr[i];
//                totalGArr[1][i] = totalGArr[1][i-2] + gArr[i];
//            }
//        }
//
//        System.out.println(Math.max(Math.max(totalGArr[0][N], totalGArr[1][N]), totalGArr[2][N]));
//    }
}
