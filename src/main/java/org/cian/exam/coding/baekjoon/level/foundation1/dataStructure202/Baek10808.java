package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//알파벳개수
public class Baek10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] chArr = br.readLine().toCharArray();
        int[] alphabetArr = new int[26];
        int chArrlength = chArr.length;
        for(int i = 0 ; i < chArrlength ; i++) {
            alphabetArr[chArr[i]-97]++;
        }

        for(int i = 0 ; i < 26 ; i++) {
            sb.append(alphabetArr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
