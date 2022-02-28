package org.cian.exam.coding.baekjoon.level.if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * [주사위 세계] 완 / 브론즈4 / 14436KB / 136ms / 900B
 */
public class Baek2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputArr = br.readLine().replaceAll(" ","").toCharArray();
        Arrays.sort(inputArr);

        int A = (int)inputArr[0] - 48;
        int B = (int)inputArr[1] - 48;
        int C = (int)inputArr[2] - 48;

        int price = 0;

        if(A == B && A == C) {
            price += 10000 + A * 1000;
        }else if(A != B && A != C && B != C) {
            price += C * 100;
        }else {
            if(A == B || A == C) {
                price += 1000 + A * 100;
            }else {
                price += 1000 + B * 100;
            }
        }

        System.out.println(price);
    }
}
