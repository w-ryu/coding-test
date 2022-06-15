package org.cian.exam.coding.baekjoon.level.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * [수 찾기] - 완
 */
public class Baek10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int[] numArr = new int[3];
        int n = 0;
        for(String unit : inputArr) {
            numArr[n++] = Integer.parseInt(unit);
        }
        Arrays.sort(numArr);

        System.out.println(numArr[1]);
    }
}
