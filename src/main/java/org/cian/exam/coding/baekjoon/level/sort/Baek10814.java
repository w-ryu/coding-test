package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baek10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] memberArr = new String[N][2];

        for(int i = 0 ; i < N ; i++) {
            String[] strArr = br.readLine().split(" ");
            memberArr[i][0] = strArr[0];
            memberArr[i][1] = strArr[1];
        }

        Arrays.sort(memberArr, (member1, member2) -> {
            return Integer.parseInt(member1[0]) - Integer.parseInt(member2[0]);
        });

        StringBuilder sb = new StringBuilder();
        for(String[] member : memberArr) {
            sb.append(member[0] + " " + member[1]).append("\n");
        }

        System.out.println(sb);
    }
}
