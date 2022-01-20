package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//쇠막대기
public class Baek10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String pipe = br.readLine().replaceAll("\\(\\)", "1");
        int pipeTotal = pipe.replaceAll("1", "")
                .replaceAll("\\)", "").length();
        Stack<Integer> st = new Stack<>();
        boolean[] pipeCheck = new boolean[pipeTotal];
        int pipeNum = 1;
        int endPipeCnt = 0;
        int count = 0;
        for(int i = 0 ; i < pipe.length() ; i++){
            switch(pipe.charAt(i)) {
                case '1':
                    break;
                case '(':
                    st.push(pipeNum++);
                    break;
                case ')':
                    st.pop();
                    break;
            }
        }
        System.out.println(sb);
    }
}
