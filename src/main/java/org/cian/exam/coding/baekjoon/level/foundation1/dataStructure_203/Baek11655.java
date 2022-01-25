package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure_203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [ROT13]
 */

public class Baek11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] charArr = br.readLine().toCharArray();
        for(char ch : charArr) {
            char rot13Char;
            if(ch >= 'a' && ch <= 'z') {
                rot13Char = (char)(((ch - 84) % 26) + 97);
            }else if(ch >= 'A' && ch <= 'Z') {
                rot13Char = (char)(((ch - 52) % 26) + 65);
            }else {
                rot13Char = ch;
            }
            sb.append(rot13Char);
        }
        System.out.println(sb);
    }
}
