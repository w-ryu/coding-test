package org.cian.exam.coding.baekjoon.level.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int result = 0;
        for (char c : charArray) {
            int num = (int)c - 65;
            if(num < 15) {
                result += (num / 3) + 3;
            }else if(num > 14 && num < 19) {
                result += 8;
            }else if(num > 18 && num < 22) {
                result += 9;
            }else {
                result += 10;
            }
        }
        System.out.println(result);
    }
}
