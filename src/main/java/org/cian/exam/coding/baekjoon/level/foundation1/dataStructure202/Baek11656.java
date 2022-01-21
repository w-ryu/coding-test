package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//접미사 배열
public class Baek11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        int sLength = S.length();
        String[] sArr = new String[sLength];
        for(int i = 0 ; i < sLength ; i++) {
            sArr[i] = S.substring(i);
        }
        Arrays.sort(sArr);
        for(String str : sArr) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
