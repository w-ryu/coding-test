package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Recursion {
    public static void baek10870() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] intArray = new int[n+1];

        for(int i = 0 ; i < n+1 ; i++) {
            if(i == 0){
                intArray[i] = 0;
            }else if(i == 1) {
                intArray[i] = 1;
            }else {
                intArray[i] = intArray[i-1] + intArray[i-2];
            }
        }
        System.out.println(intArray[n]);
    }

    public static void baek10872() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 1; i <= N ; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
