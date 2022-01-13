package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        Print print = new Print();
        String s = "3people unFollowed me";
//        int n = 10;
        int[] arr1 = {2,6,8,14};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        int[][] sizes = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        String[] strArr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] strArr2 = {"josipa", "filipa", "marina", "nikola"};

        String answer = solutionClass.solution(s);
        print.print(answer);

    }
}
class Solution0000 {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < strArr.length ; i++) {
            char[] charArr = strArr[i].toLowerCase(Locale.ROOT).toCharArray();
            if(charArr[0] < '0' || charArr[0] > '9'){
                charArr[0] = Character.toUpperCase(charArr[0]);
            }
            sb.append(new String(charArr)).append(" ");
        }
        return sb.toString().trim();
    }
}

class Print {
    public void print(int answer) {
        System.out.println(answer);
    }

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
