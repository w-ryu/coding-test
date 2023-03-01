package org.cian.exam.coding.book.thisisct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int[][] nArr = new int[31][31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String[] varArr = br.readLine().split(" ");
        int N = Integer.parseInt(varArr[0]);
        int M = Integer.parseInt(varArr[1]);

        for(int i = 0 ; i < N ; i++) {
            String[] numArr = br.readLine().split(" ");
            int min = 10001;
            for(int j = 0 ; j < M ; j++) {
                int num = Integer.parseInt(numArr[j]);
                min = Math.min(num, min);
            }
            answer = Math.max(min, answer);
        }

        System.out.println(answer);
    }
}

