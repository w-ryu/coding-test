package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [후위표기식2]
 */
public class Baek1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String inputStr = br.readLine();
        int[] numArr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        char[] chArr = inputStr.toCharArray();
        int chArrLength = chArr.length;
        Stack<Double> st = new Stack<>();

        for(int i = 0 ; i < chArrLength ; i++) {

            if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
                st.push((double)numArr[chArr[i]-65]);
            }else {
                double N1 = st.pop();
                double N2 = st.pop();
                switch(chArr[i]) {
                    case '+':
                        st.push(N2 + N1);
                        break;
                    case '-':
                        st.push(N2 - N1);
                        break;
                    case '*':
                        st.push(N2 * N1);
                        break;
                    case '/':
                        st.push(N2 / N1);
                        break;
                }
            }
        }

        System.out.printf("%.2f", st.pop());
    }
}
