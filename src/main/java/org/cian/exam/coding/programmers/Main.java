package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        Print print = new Print();
        String s = "-1 -2 -3 -4";
        int n = 15;
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,4},{3,2},{4,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] strArr2 = {"josipa", "filipa", "marina", "nikola"};

        int answer = solutionClass.solution(n);
        print.print(answer);

    }
}
class Solution0000 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++) {
            int sum = 0;
            int num = i;
            while(sum < n) {
                sum += num;
                num++;
            }
            if(sum == n){
                answer++;
            }
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
