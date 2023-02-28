package org.cian.exam.coding.leetcode;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solutionClass = new Solution();
        Print print = new Print();
        String s1 = "KAKAO";
        String s2 = "e=m*c^2";
        int n = 9;
        int t = 4;
        int m = 3;
        int p = 1;
        long l = 12345;
        int[] arr1 = {2,7,11,15};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String[] strArr2 = {"eden", "kiki"};
        String[][] strsArr2 = {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}};

        int[] answer = solutionClass.addTwoNumbers();
        print.print(answer);

    }
}

class Solution {
    public int[] addTwoNumbers() {
        return new int[1];
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
