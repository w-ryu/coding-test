package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        Print print = new Print();
        String s = "aabbaccc";
        int n = 4;
        int t = 4;
        int m = 2;
        int p = 1;
        long l = 12345;
        int[] arr1 = {3, 30, 34, 5, 9};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"97674223", "119", "1195524421"};
        String[] strArr2 = {"eden", "kiki"};

        String answer = solutionClass.solution(arr1);
        print.print(answer);

    }
}

class Solution0000 {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        int length = numbers.length;
        String[] arr = new String[length];
        int n = 0;
        for(int i = 0 ; i < length ; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = length-1 ; i >= 0 ; i--) {
            int minLength = arr[i].length() >= arr[i-1].length() ? arr[i].length() : arr[i-1].length();

            for(int j = 0 ; j < minLength ; j ++){
                if(arr[i].indexOf(j) == arr[i-1].indexOf(j)){

                }else {
                    sb.append(arr[i]);
                }
            }
        }
        return sb.toString();
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
