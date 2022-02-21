package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int answer = 1;
            int[] inputArr = new int[2];
            String[] strArr = br.readLine().split(" ");
            inputArr[0] = Integer.parseInt(strArr[0]);
            inputArr[1] = Integer.parseInt(strArr[1]);
            Arrays.sort(inputArr);

            int num1 = inputArr[0];
            int num2 = inputArr[1];

            for(int j = 2 ; j <= (int)Math.sqrt(inputArr[1])+1 ; j++) {
                if(num1 == 1 || num2 == 1) {
                    answer *= num1 * num2;
                    break;
                }
                while(num1 / j > 0 || num2 / j > 0) {
                    if(num1 % j > 0 && num2 % j > 0) break;
                    if(num1 % j == 0) num1 /= j;
                    if(num2 % j == 0) num2 /= j;
                    answer *= j;
                }
                if(j == (int)Math.sqrt(inputArr[1])) {
                    answer *= num1 * num2;
                }
            }
            System.out.println(answer);
        }
    }
}

