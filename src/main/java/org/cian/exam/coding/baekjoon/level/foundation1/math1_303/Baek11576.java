package org.cian.exam.coding.baekjoon.level.foundation1.math1_303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [Base Conversion]
 */
public class Baek11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputArr = br.readLine().split(" ");
        int A = Integer.parseInt(inputArr[0]);
        int B = Integer.parseInt(inputArr[1]);

        int numLength = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        String[] numArr = br.readLine().split(" ");

        long totalNum = 0;

        for(int i = numLength - 1 ; i >= 0 ; i--) {
            totalNum += Integer.parseInt(numArr[i]) * (long)Math.pow(A, numLength - 1 - i);
        }

        while(totalNum > 0) {
            int remainder = (int)totalNum % B;
            totalNum /= B;
            st.push(remainder);
        }

        boolean emptyCheck = true;
        while(!st.empty()){
            int num = st.pop();
            if(emptyCheck && num > 0) {
                emptyCheck = false;
            }
            if(!emptyCheck){
                sb.append(num).append(" ");
            }
        }

        System.out.println(sb);
    }
}
