package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] intArray = new int[N];

        for(int i = 0 ; i < N ; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArray);
        StringBuffer sb = new StringBuffer();
        for (int num : intArray) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
