package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strArr = new String[N];
        for(int i = 0 ; i < N ; i++) {
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr, (str1, str2) -> {
            if(str1.length() == str2.length()) {
                return str1.compareTo(str2);
            }else {
                return str1.length() - str2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]).append("\n");

        for(int i = 1 ; i < N ; i++) {
            if(!strArr[i].equals(strArr[i-1])){
                sb.append(strArr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
