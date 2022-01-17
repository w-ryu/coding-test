package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] intArray = new int[4];

        for(int i = 0 ; i < intArray.length ; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());

            if(i == 2 || i == 3) {
                intArray[i] -= intArray[i - 2];
            }
        }

        intArray = Arrays.stream(intArray).sorted().toArray();

        System.out.println(intArray[0]);
    }
}
