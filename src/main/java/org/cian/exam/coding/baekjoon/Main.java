package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] numArr = new int[N];
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
            if(max < numArr[i]) {
                max = numArr[i];
            }
        }
        boolean[] numCheck = new boolean[max+1];

        numCheck[0] = numCheck[1] = true;

        for(int i = 2 ; i <= Math.sqrt(max) ; i++) {
            if(numCheck[i]) {
                continue;
            }
            for(int j = i * 2 ; j <= max ; j += i) {
                numCheck[j] = true;
            }
        }

        for(int i = 0 ; i < N ; i++) {
            if(!numCheck[numArr[i]]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
