package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] intArray = new int[3];

            for(int i = 0 ; i < 3 ; i++) {
                intArray[i] = Integer.parseInt(st.nextToken());
            }

            if(intArray[0] + intArray[1] + intArray[2] == 0) {
                break;
            }

            intArray = Arrays.stream(intArray).sorted().toArray();

            int wh = (intArray[0] * intArray[0]) + (intArray[1] * intArray[1]);
            int d = intArray[2] * intArray[2];

            if(wh == d) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}
