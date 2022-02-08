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
        int[] arr1 = {93, 30, 55};
        int[] arr2 = {1, 30, 5};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] strArr2 = {"josipa", "filipa", "marina", "nikola"};

        int[] answer = solutionClass.solution(arr1, arr2);
        print.print(answer);

    }
}
class Solution0000 {
    public int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        if (length == 1) {
            return new int[]{1};
        }

        Stack<Integer> st = new Stack<>();
        int maxDay = 0;
        int scope = 0;
        for(int i = 0 ; i < length ; i++) {
            int count = 0;
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                count++;
            }
            if(maxDay < count) {
                maxDay = count;
                if(i == 0) continue;
                st.push(i-scope);
                scope = i;
            }

            if(i == length - 1){
                st.push(i-scope+1);
            }
        }

        int[] functions = new int[st.size()];
        for(int i = st.size()-1 ; i >=0  ; i--) {
            functions[i] = st.pop();
        }

        return functions;
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
