package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArrayX = new int[3];
        int[] intArrayY = new int[3];

        for(int i = 0 ; i < intArrayX.length ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            intArrayX[i] = Integer.parseInt(st.nextToken());
            intArrayY[i] = Integer.parseInt(st.nextToken());
        }
        intArrayX = Arrays.stream(intArrayX).sorted().toArray();
        intArrayY = Arrays.stream(intArrayY).sorted().toArray();

        int x = intArrayX[0];
        int y = intArrayY[0];

        if(intArrayX[0] == intArrayX[1]) {
            x = intArrayX[2];
        }else if(intArrayX[0] == intArrayX[2]) {
            x = intArrayX[1];
        }
        if(intArrayY[0] == intArrayY[1]){
            y = intArrayY[2];
        }else if(intArrayY[0] == intArrayY[2]){
            y = intArrayY[1];
        }

        System.out.println(x + " " + y);
    }
}
