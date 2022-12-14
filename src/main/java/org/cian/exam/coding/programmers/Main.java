package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution solutionClass = new Solution();
        Print print = new Print();
        String s1 = "011";
        String s2 = "e=m*c^2";
        int n = 2;
        int t = 4;
        int m = 16;
        int p = 1;
        long l = 12345;
        int[] arr1 = {7, 1, 3};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"TR", "RT", "TR"};
        String[] strArr2 = {"eden", "kiki"};

        long answer = solutionClass.solution(n, t);
        print.print(answer);

    }
}

class Solution {
    public long solution(int k, int d) {
        long answer = 0;

        for(int i = 0 ; i <= d ; i = i+k) {
            answer += (int)Math.sqrt(Math.pow(d,2) - Math.pow(i,2)) / k + 1;
        }

        return answer;
    }
}


class Print {
    public void print(boolean answer) {
        System.out.println(answer);
    }

    public void print(int answer) { System.out.println(answer); }

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
