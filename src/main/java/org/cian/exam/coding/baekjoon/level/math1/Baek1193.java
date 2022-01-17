package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int A = 0;
        while(A < X) {
            int left = (A * (A + 1)) / 2;
            int right = (A + 1) * (A + 2) / 2;
            if(left < X && right >= X) {
                int num = X - left;
                int row = A + 1;
                if(row % 2 == 0) {
                    System.out.println(num + "/" + (row + 1 - num) );
                }else {
                    System.out.println((row + 1 - num) + "/" + num);
                }

                break;
            }
            A++;
        }
    }
}
