package org.cian.exam.coding.programmers.level2;

import java.util.Stack;

/**
 * 타겟넘버 [완-다시]
 * DFS / 완전탐색 사용
 */
public class P_43165 {
    public static int answer;
    public static int[] numbers;
    public static int target;
    public int solution(int[] arr, int n) {
        answer = 0;
        numbers = arr;
        target = n;
        dfs(0 ,0);

        return answer;
    }

    public static void dfs(int index, int sum) {
        if(index == numbers.length) {
            if(sum == target){
                answer++;
            }
            return;
        }

        sum += numbers[index];
        dfs(index+1, sum);
        sum += numbers[index] * (-2);
        dfs(index+1, sum);

        return;
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