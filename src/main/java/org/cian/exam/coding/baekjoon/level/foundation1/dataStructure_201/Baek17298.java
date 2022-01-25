package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure_201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [오큰수]
 */
public class Baek17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] numArr = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
        }

        for(int i = 0 ; i < N ; i++) {
            while(!st.empty() && numArr[i] > numArr[st.peek()]){
                numArr[st.pop()] = numArr[i];
            }
            st.push(i);
        }

        while(!st.empty()) {
            numArr[st.pop()] = -1;
        }

        for(int num : numArr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}
