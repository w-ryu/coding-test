package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] strArray = br.readLine().split(" ");
        int A = Integer.parseInt(strArray[0]);
        int B = Integer.parseInt(strArray[1]);
        int V = Integer.parseInt(strArray[2]);
        int num = (V - A) / (A - B) - 1;
        while(num < V) {
            int left = (A - B) * num + A;
            int right = (A - B) * (num + 1) + A;
            if(left < V && right >= V) {
                System.out.println(num + 2);
                break;
            }
            num++;
        }
    }
}
