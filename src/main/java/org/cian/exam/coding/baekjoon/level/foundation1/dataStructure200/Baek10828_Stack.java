package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/**
 * [스택]
 */

public class Baek10828_Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++) {
            String[] inputArr = br.readLine().split(" ");

            switch(inputArr[0]) {
                case "push":
                    st.push(Integer.parseInt(inputArr[1]));
                    break;
                case "pop":
                    if(st.empty()) {
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(st.pop()).append("\n");
                    }
                    break;
                case "top":
                    if(st.empty()) {
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(st.peek()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(st.size()).append("\n");
                    break;
                case "empty":
                    if(st.empty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
