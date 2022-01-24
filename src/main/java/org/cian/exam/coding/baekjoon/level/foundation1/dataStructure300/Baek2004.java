package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [합 0의 개수]
 * - 2, 5의 각각의 갯수를 구해서 작은 것으로 판별
 */
public class Baek2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        long n = Integer.parseInt(inputArr[0]);
        long m = Integer.parseInt(inputArr[1]);

        long fiveCnt = fiveCount(n) - (fiveCount(n-m) + fiveCount(m));
        long twoCnt = twoCount(n) - (twoCount(n-m) + twoCount(m));
        System.out.println(Math.min(fiveCnt, twoCnt));
    }

    public static long fiveCount(long n) {
        long count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static long twoCount(long n) {
        long count = 0;
        while (n >= 2) {
            count += n / 2;
            n /= 2;
        }
        return count;
    }
}
