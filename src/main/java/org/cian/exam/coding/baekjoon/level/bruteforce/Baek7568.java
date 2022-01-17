package org.cian.exam.coding.baekjoon.level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] kg = new int[N];
        int[] cm = new int[N];
        for(int i = 0 ; i < N ; i++) {
            String[] size = br.readLine().split(" ");
            kg[count] = Integer.parseInt(size[0]);
            cm[count++] = Integer.parseInt(size[1]);
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < N ; i++) {
            int rank = 1;
            for(int j = 0 ; j < N ; j++) {
                if(i == j) continue;
                if(kg[i] < kg[j] && cm[i] < cm[j]){
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}
