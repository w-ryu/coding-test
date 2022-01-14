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
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] strArr2 = {"josipa", "filipa", "marina", "nikola"};

        String answer = solutionClass.solution(n, t, m, p);
        print.print(answer);

    }
}
class Solution0000 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        char[] answerArr = new char[t];
        System.out.println(answerArr[0] == 15);
        for(int i = 0 ;  ; i++) {
            int quotient = i / n;
            int remainder = i % n;
            while(quotient == 0){
                quotient = i/n;
            }

        }
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
