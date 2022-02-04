package org.cian.exam.coding.programmers.level2;

import java.util.Stack;

/**
 * 124 나라의 숫자 [완]
 *
 *
 */
public class P_12899 {
    public String solution(int n) {
        int[] arr = {1,2,4};
        int input = n+2;
        Stack<Integer> st = new Stack<>();
        String answer = "";

        while(input > 2) {
            int remainder = input % 3;
            st.push(arr[remainder]);
            input = input / 3 + 1;
        }

        while(!st.isEmpty()){
            answer += st.pop();
        }

        return answer;
    }
}

//class Solution {
//    public String solution(int n) {
//        String[] num = {"4","1","2"};
//        String answer = "";
//
//        while(n > 0){
//            answer = num[n % 3] + answer;
//            n = (n - 1) / 3;
//        }
//        return answer;
//    }
//}