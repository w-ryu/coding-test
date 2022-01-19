package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//스택수열
public class Baek1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];

        for(int i = 0 ; i < N ; i++) {
            result[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int start = 0;
        for(int i = 0 ; i < N ; i++) {
            if(result[i] >= start) {
                if(i == 0) start = 1;
                for(int j = start ; j <= result[i] ; j++) {
                    st.push(j);
                    sb.append("+").append("\n");
                }
                st.pop();
                sb.append("-").append("\n");
                start = result[i]+1;
            }else if(result[i] < start && result[i] >= st.peek()){
                int gap = st.peek() - result[i] - 1;
                while(gap < 0) {
                    st.pop();
                    sb.append("-").append("\n");
                    gap++;
                }
            }else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
