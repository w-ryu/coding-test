package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
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

