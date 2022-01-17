package org.cian.exam.coding.baekjoon.level.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputList = br.readLine().toUpperCase().toCharArray();
        int[] intList = new int[26];

        for(int i = 0 ; i < inputList.length ; i++) {
            intList[(inputList[i]-65)]++;
        }
        int max = Arrays.stream(intList).max().getAsInt();

        int cnt = 0;
        char index = 65;
        for (int j = 0 ; j < intList.length ; j++) {
            if(max == intList[j]){
                cnt++;
                index += j;
            }
        }

        if(cnt > 1) {
            System.out.println("?");
        }else {
            System.out.println(index);
        }
    }
}
