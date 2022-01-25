package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure_203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [문자열 분석]
 */
public class Baek10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while((str = br.readLine()) != null) {

            char[] charArr = str.toCharArray();
            int[] answerArr = new int[4];
            for(char ch : charArr) {
                if(ch >= 'a' && ch <= 'z') {
                    answerArr[0]++;
                }else if(ch >= 'A' && ch <= 'Z') {
                    answerArr[1]++;
                }else if(ch >= '0' && ch <= '9'){
                    answerArr[2]++;
                }else if(ch == ' '){
                    answerArr[3]++;
                }
            }
            for(int count : answerArr) {
                sb.append(count).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
