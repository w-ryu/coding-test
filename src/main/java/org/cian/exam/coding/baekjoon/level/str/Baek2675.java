package org.cian.exam.coding.baekjoon.level.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String[] strList = br.readLine().split(" ");
            StringBuffer sb = new StringBuffer();
            int R = Integer.parseInt(strList[0]);
            char[] SList = strList[1].toCharArray();


            for(int j = 0 ; j < SList.length ; j++) {
                for(int k = 0 ; k < R ; k++) {
                    sb.append(SList[j]);
                }
            }
            System.out.println(sb);
        }
    }
}
