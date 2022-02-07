package org.cian.exam.coding.baekjoon.level.foundation1.dynamic_401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [스티커] 131648KB / 700ms / 1327B / 완 - 다시
 * DP로 풀긴했지만, 정확한 점화식을 구현하지 못했음 다시
 *
 */
public class Baek9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N+1];
        numArr[0] = 1;
        numArr[1] = 3;

        for(int i = 2 ; i <= N ; i++) {
            numArr[i] = (2 * numArr[i-1] + numArr[i-2]) % 9901;
        }

        System.out.println(numArr[N]);
    }
}
