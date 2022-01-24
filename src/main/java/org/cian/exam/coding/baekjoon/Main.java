package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int num = N;
        if(N == 0) {
            sb.append(0);
        }else if(N < 0) {
            while((N / (int)Math.pow(2, count)) > 0) {
                count++;
                num = (count + 1) * (-2);
            }
            sb.append(count).append("\n");
        }else {
            sb.append(N);
        }

        System.out.println(sb);
    }
}
