package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//단어뒤집기
public class Baek9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < T ; i++) {
            String[] inputArr = br.readLine().split(" ");
            int inputLength = inputArr.length;
            for(int j = 0 ; j < inputLength ; j++){
                char[] strArr = inputArr[j].toCharArray();
                int strLength = strArr.length;
                for(int k = strLength-1 ; k >= 0 ; k--) {
                    sb.append(strArr[k]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
