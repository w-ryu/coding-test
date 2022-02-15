package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        Print print = new Print();
        String s = "17";
        int n = 10;
        int t = 2;
        int m = 2;
        int p = 1;
        long l = 12345;
        int[] arr1 = {3, 0, 6, 1, 5};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"97674223", "119", "1195524421"};
        String[] strArr2 = {"eden", "kiki"};

        int[] answer = solutionClass.solution(n, t);
        print.print(answer);

    }
}

class Solution0000 {
    public int[] solution(int brown, int yellow) {
        int a = (brown-4) / 2;
        int[] answer = {};
        for(int i = 1 ; i < brown/2 ; i++) {
            int b = (int)Math.pow(i,2) - (a * i) + yellow;
            if(b == 0) {
                answer = new int[]{i+2, a-i+2};
                if(a-i+2 > i+2) {
                    answer = new int[]{a-i+2, i+2};
                }
            }
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
