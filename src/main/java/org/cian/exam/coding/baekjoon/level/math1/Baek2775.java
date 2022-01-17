package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int floor = Integer.parseInt(br.readLine());
            int num = Integer.parseInt(br.readLine());
            int[][] pArray = new int[floor+1][num];

            for(int j = 0 ; j < num ; j++) {
                for(int k = 0 ; k <= floor ; k++) {
                    if (j == 0) {
                        pArray[k][j] = 1;
                    }else if(k == 0) {
                        pArray[k][j] = j + 1;
                    }else {
                        pArray[k][j] = pArray[k-1][j] + pArray[k][j-1];
                    }
                }
            }
            System.out.println(pArray[floor][num-1]);

        }
    }
}
