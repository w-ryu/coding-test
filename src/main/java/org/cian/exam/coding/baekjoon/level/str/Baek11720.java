package org.cian.exam.coding.baekjoon.level.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] inputList = br.readLine().toCharArray();
        int result = 0;
        for (char c : inputList) {
            int num = (int)c-48;
            result += num;
        }
        System.out.println(result);
    }
}
