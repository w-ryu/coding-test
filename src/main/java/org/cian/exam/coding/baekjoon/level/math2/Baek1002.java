package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String[] strArray = br.readLine().split(" ");
            int x1 = Integer.parseInt(strArray[0]);
            int y1 = Integer.parseInt(strArray[1]);
            int r1 = Integer.parseInt(strArray[2]);
            int x2 = Integer.parseInt(strArray[3]);
            int y2 = Integer.parseInt(strArray[4]);
            int r2 = Integer.parseInt(strArray[5]);

            double distanceP = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }else if(x1 == x2 && y1 == y2 && r1 != r2) {
                System.out.println(0);
            }else if(distanceP < Math.pow(r1 - r2, 2)) {
                System.out.println(0);
            }else if(distanceP == Math.pow(r1 - r2, 2)) {
                System.out.println(1);
            }else if(distanceP == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            }else if(distanceP > Math.pow(r1 + r2, 2)) {
                System.out.println(0);
            }else {
                System.out.println(2);
            }
        }
    }
}
