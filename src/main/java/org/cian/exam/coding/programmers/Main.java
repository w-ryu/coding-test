package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        Print print = new Print();
        String s = "aabbaccc";
        int n = 10;
        int t = 4;
        int m = 2;
        int p = 1;
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] strArr2 = {"josipa", "filipa", "marina", "nikola"};

        String answer = solutionClass.solution(n);
        print.print(answer);

    }
}
class Solution0000 {
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



class Print {
    public void print(int answer) {
        System.out.println(answer);
    }

    public void print(long answer) { System.out.println(answer);}

    public void print(BigInteger answer) { System.out.println(answer);}

    public void print(String answer) {
        System.out.println(answer);
    }

    public void print(int[] answer) {
        System.out.println(Arrays.toString(answer));
    }

    public void print(String[] answer) {
        System.out.println(Arrays.toString(answer));
    }

    public void print(int[][] answer) {
        System.out.println(Arrays.deepToString(answer));
    }

    public void print(String[][] answer) {
        System.out.println(Arrays.deepToString(answer));
    }
}
