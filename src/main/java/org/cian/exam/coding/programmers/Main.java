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

        long answer = solutionClass.solution(s1);
        print.print(answer);

    }
}

class Solution {
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] primeArr;
    public static char[] strArr;
    public static int answer = 0;
    public static boolean[] numCheck;
    public int solution(String numbers) {
        strArr = numbers.toCharArray();
        Arrays.sort(strArr);
        int max = Integer.parseInt(String.valueOf(sb.append(strArr).reverse()));
        primeArr = new boolean[max+1];

        primeArr[0] = primeArr[1] = true;
        for(int i = 2 ; i <= Math.sqrt(max) ; i++) {
            if(primeArr[i]) continue;
            for(int j = i + i ; j <= max ; j += i) {
                primeArr[j] = true;
            }
        }

        int length = strArr.length;

        for(int i = 1 ; i <= length ; i++) {
            numCheck = new boolean[length];
            primeCheck("", i);
        }

        return answer;
    }

    public void primeCheck(String numStr, int size) {
        if(numStr.length() == size) {
            int num = Integer.parseInt(numStr);
            if(!primeArr[num]){
                answer++;
                primeArr[num] = true;
            }
            return;
        }

        int length = strArr.length;
        for(int i = 0 ; i < length ; i++) {
            if(!numCheck[i]){
                String str = numStr + strArr[i];
                numCheck[i] = true;
                primeCheck(str, size);
                numCheck[i] = false;
            }
        }
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
