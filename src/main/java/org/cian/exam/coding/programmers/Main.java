package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        Print print = new Print();
        String s1 = "100-200*300-500+20";
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

class Solution0000 {
    public long solution(String expression) {
        String[] strArr = expression.replaceAll("[+,\\-,*]", " ").split(" ");
        int numLength = strArr.length;

        long[] numArr = new long[numLength];
        for(int i = 0 ; i < numLength ; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        List<Character> codeList = new ArrayList<>();
        String codeStr = expression.replaceAll("[0-9]", "");
        for(int i = 0 ; i < numLength-1 ; i++){
            codeList.add(codeStr.charAt(i));
        }

        int codeType = codeList.stream().distinct().toArray().length;

        Function<Integer, Integer> f = i -> i+10;

        System.out.println();
        System.out.println(codeList);



        System.out.println("expression = " + expression);


        long answer = 0;
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
