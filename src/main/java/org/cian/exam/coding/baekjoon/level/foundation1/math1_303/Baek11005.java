package org.cian.exam.coding.baekjoon.level.foundation1.math1_303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [진법 변환2]
 */
public class Baek11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputArr = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr[0]);
        int B = Integer.parseInt(inputArr[1]);
        int num = N;
        if(num == 0) {
            sb.append(0);
        }
        while(num > 0) {
            int remainder = num % B;
            num = num / B;
            if(remainder > 9) {
                sb.append((char)(remainder + 55));
            }else {
                sb.append(remainder);
            }
        }

        System.out.println(sb.reverse());
    }
}
