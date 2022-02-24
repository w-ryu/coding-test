package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String[] inputArr = br.readLine().split(" ");
            int N1 = Integer.parseInt(inputArr[0]);
            int N2 = Integer.parseInt(inputArr[1]);

            if(N1 == 0 && N2 == 0) {
                break;
            }else if(N1 % N2 == 0) {
                sb.append("multiple").append("\n");
            }else if(N2 % N1 == 0) {
                sb.append("factor").append("\n");
            }else {
                sb.append("neither").append("\n");
            }
        }

        System.out.println(sb);
    }
}

