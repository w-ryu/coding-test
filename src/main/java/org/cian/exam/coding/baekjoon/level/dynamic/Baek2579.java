package org.cian.exam.coding.baekjoon.level.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [계단오르기] - 완/다시
 * 최초 기준 설정이랑 공통 로직 확인
 */
public class Baek2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int[]  rowN = new int[301];
        int[] sumArr = new int[301];

        for(int i = 1 ; i <= R ; i++) {
            rowN[i] = Integer.parseInt(br.readLine());
        }

        sumArr[1] = rowN[1];
        sumArr[2] = rowN[1] + rowN[2];
        sumArr[3] = Math.max(rowN[1], rowN[2]) + rowN[3];

        for(int i = 4 ; i <= R ; i++){
            sumArr[i] = Math.max(sumArr[i-3] + rowN[i-1], sumArr[i-2]) + rowN[i];
        }

        System.out.println(sumArr[R]);
    }
}
