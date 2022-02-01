package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [가장 긴 증가하는 부분 수열] 미완
 */
public class Baek11053 {
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

     public static void longSize() {

     }
}
