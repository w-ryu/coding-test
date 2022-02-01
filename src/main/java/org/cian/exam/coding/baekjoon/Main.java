package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int answer = 0;
        int lastNum = 0;
        for(int i = 0 ; i < N ; i++) {
            int num = Integer.parseInt(inputArr[i]);
            if(lastNum < num){
                lastNum = num;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
