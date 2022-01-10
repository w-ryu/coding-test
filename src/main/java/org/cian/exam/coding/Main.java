package org.cian.exam.coding;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        String s = "1D2S#10S";
        int answer = solutionClass.solution(s);
        System.out.println(answer);

//        for(String a : answer) {
//            System.out.print(a + ", ");
//        }

//        System.out.print("[");
//        for(int[] a : answer){
//            System.out.print("[");
//            for(int b : a) {
//                System.out.print(b);
//                System.out.print(", ");
//            }
//            System.out.print("]");
//        }
//        System.out.print("]");
    }
}

class Solution0000 {
    public int solution(String dartResult) {
        char[] charArr = dartResult.toCharArray();
        int[] gradeArr = new int[3];
        int[][] typeArr = new int[3][3];
        int length = charArr.length;
        int answer = 0;
        int count = 0;

        for(int i = 0 ; i < length ; i++) {
            char c = charArr[i];
            System.out.println("c = " + c);
            System.out.println("count = " + count);

            switch(c) {
                case 'S':
                    typeArr[count - 1][2] = 1;
                case 'D':
                    typeArr[count - 1][2] = 2;
                case 'T':
                    typeArr[count - 1][2] = 3;
                case '*':
                    typeArr[count - 1][1] = 2;
                    if(count != 1) {
                        typeArr[count - 2][1] = 2;
                    }
                case '#':
                    typeArr[count - 1][1] = -1;
                default:
                    if(i > 0 && charArr[i-1] == '1' && charArr[i] == '0'){
                        typeArr[count - 1][0] = 10;
                    }else {
                        typeArr[count][0] = Character.getNumericValue(c);
                        count++;
                    }
            }
        }

        for(int a : gradeArr) {
            System.out.println(a);
            answer += a;
        }
        return answer;
    }
}
