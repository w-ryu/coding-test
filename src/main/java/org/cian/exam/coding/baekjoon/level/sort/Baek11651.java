package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek11651 {
    // 이차배열 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] xyArr = new int[N][2];


        for(int i = 0 ; i < N ; i++) {
            String[] strArr = br.readLine().split(" ");
            xyArr[i][1] = Integer.parseInt(strArr[0]);
            xyArr[i][0] = Integer.parseInt(strArr[1]);
        }

        Arrays.sort(xyArr, (xy1, xy2) -> {
            if(xy1[0] == xy2[0]) {
                return Integer.compare(xy1[1], xy2[1]);
            }else {
                return Integer.compare(xy1[0], xy2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int[] xy : xyArr) {
            sb.append(xy[1] + " " + xy[0]).append("\n");
        }
        System.out.println(sb);
    }
}
