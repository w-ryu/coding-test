package org.cian.exam.coding.baekjoon.level.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * [분산처리] - 완
 */
public class Baek1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            String[] inputStr = br.readLine().split(" ");

            int a = Integer.parseInt(inputStr[0]);
            int b = Integer.parseInt(inputStr[1]);

            int result = 1;

            for(int j = 0 ; j < b ; j++) {
                result = (result * a) % 10;
            }
            if(result == 0) result = 10;
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
