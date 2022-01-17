package org.cian.exam.coding.baekjoon.level.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputList = br.readLine().toCharArray();
        int[] resultList = new int[26];

        for (int i = 0 ; i < resultList.length ; i++) {
            resultList[i] = -1;
        }

        for(int j = inputList.length - 1 ; j >= 0 ; j-- ) {
            int num = (int)inputList[j] - 97;
            resultList[num] = j;
        }
        StringBuffer sb = new StringBuffer();
        for (int i : resultList) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
