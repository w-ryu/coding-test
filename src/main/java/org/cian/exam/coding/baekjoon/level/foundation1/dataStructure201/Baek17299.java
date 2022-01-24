package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [오등큰수]
 */
public class Baek17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] numArr = new int[N];
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
            if(max < numArr[i]) {
                max = numArr[i];
            }
        }

        int[] numCount = new int[max+1];

        for(int i = 0 ; i < N ; i++) {
            numCount[numArr[i]]++;
        }

        for(int i = 0 ; i < N ; i++) {
            while(!st.empty() && numCount[numArr[i]] > numCount[numArr[st.peek()]]) {
                numArr[st.pop()] = numArr[i];
            }
            st.push(i);
        }

        while(!st.empty()){
            numArr[st.pop()] = -1;
        }

        for(int i = 0 ; i < N ; i++) {
            sb.append(numArr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
