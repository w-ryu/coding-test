package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [동물원] 14500KB / 132ms / 554B / 완 - 다시
 * DP로 풀어야하는데 그냥 N항에 대한 점화식으로만 풀었음...
 *
 */
public class Baek1309 {
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
