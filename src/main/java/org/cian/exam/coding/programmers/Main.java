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
        int n = 16;
        int t = 1;
        int m = 16;
        int p = 1;
        long l = 12345;
        int[] arr1 = {3, 0, 6, 1, 5};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"97674223", "119", "1195524421"};
        String[] strArr2 = {"eden", "kiki"};

        long answer = solutionClass.solution(n, t, m);
        print.print(answer);

    }
}

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(a != b){
            a = (a+1)/2;
            b = (b+1)/2;
            ++answer;
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
