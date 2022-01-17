package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baek11650 {
    // 이차배열 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] intArr = new int[N][2];

        for(int i = 0 ; i < N ; i++) {
            String[] strArr = br.readLine().split(" ");
            intArr[i][0] = Integer.parseInt(strArr[0]);
            intArr[i][1] = Integer.parseInt(strArr[1]);
        }

        Arrays.sort(intArr, (xy1, xy2) -> {
            if(xy1[0] == xy2[0]) {
                return Integer.compare(xy1[1], xy2[1]);
            }else {
                return Integer.compare(xy1[0], xy2[0]);
            }
        });

        StringBuffer sb = new StringBuffer();
        for(int[] a : intArr) {
            sb.append(a[0] + " " + a[1]).append("\n");
        }
        System.out.println(sb);
    }
}
