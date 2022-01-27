package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [2xN타일링] 14328KB / 136ms / 540B
 * 뭔가 더 빠른게 있을것 같은데...
 */
public class Baek11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N + 1];
        numArr[0] = numArr[1] = 1;

        for (int i = 2; i <= N; i++) {
            numArr[i] = (numArr[i - 1] + numArr[i - 2]) % 10007;
        }

        System.out.println(numArr[N]);
    }
}
