package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            String[] rgb = br.readLine().split(" ");
            int R = Integer.parseInt(rgb[0]);
            int G = Integer.parseInt(rgb[1]);
            int B = Integer.parseInt(rgb[2]);

            int[] rgbPrice = new int[3];



        }

        System.out.println(sb);
    }
}

