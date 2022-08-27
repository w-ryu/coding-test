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
        int[] arr1 = {7, 1, 3};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"TR", "RT", "TR"};
        String[] strArr2 = {"eden", "kiki"};

        String answer = solutionClass.solution(strArr1, arr1);
        print.print(answer);

    }
}

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int choicesLen = choices.length;
        int[] typeScore = new int[4];
        char[] typeList = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        for(int i = 0 ; i < choicesLen ; i++) {
            choices[i] -= 4;
            char[] surveyCharList = survey[i].toCharArray();

            if(surveyCharList[0] > surveyCharList[1]) {
                choices[i] *= -1;
                Character tmp = surveyCharList[0];
                surveyCharList[0] = surveyCharList[1];
                surveyCharList[1] = tmp;
            }

            switch(surveyCharList[0]) {
                case 'R' :
                    typeScore[0] += choices[i];
                    break;
                case 'C' :
                    typeScore[1] += choices[i];
                    break;
                case 'J' :
                    typeScore[2] += choices[i];
                    break;
                case 'A' :
                    typeScore[3] += choices[i];
                    break;
            }
        }

        for(int i = 0 ; i < 4 ; i++) {
            answer += typeScore[i] <= 0 ? typeList[i * 2] : typeList[i * 2 + 1];
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
