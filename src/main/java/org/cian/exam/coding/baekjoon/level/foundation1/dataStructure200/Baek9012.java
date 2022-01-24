package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [괄호]
 */
public class Baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < T ; i++) {
            char[] inputArr = br.readLine().toCharArray();
            Stack<Character> st = new Stack<>();
            int inputLength = inputArr.length;
            for(int j = 0 ; j < inputLength ; j++) {
                if(st.empty()) {
                    st.push(inputArr[j]);
                    continue;
                }
                if(st.peek() == '(' && inputArr[j] == ')'){
                    st.pop();
                }else {
                    st.push(inputArr[j]);
                }
            }
            if(st.empty()) {
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
