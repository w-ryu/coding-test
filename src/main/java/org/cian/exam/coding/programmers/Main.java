package org.cian.exam.coding.programmers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        Print print = new Print();
        String s1 = "FRANCE";
        String s2 = "french";
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

        int answer = solutionClass.solution(s1, s2);
        print.print(answer);

    }
}

class Solution0000 {
    public int solution(String str1, String str2) {
        double answer = 0;
        char[] charArr1 = str1.toUpperCase(Locale.ROOT).toCharArray();
        char[] charArr2 = str2.toUpperCase(Locale.ROOT).toCharArray();

        int length1 = charArr1.length;
        int length2 = charArr2.length;

        HashSet<String> intersection = new HashSet<>();
        HashSet<String> union = new HashSet<>();

        List<String> strList1 = new ArrayList<>();
        List<String> strList2 = new ArrayList<>();

        for(int i = 0 ; i < length1-1 ;i ++) {
            if((charArr1[i] >= 'A' && charArr1[i] <= 'Z') && (charArr1[i+1] >= 'A' && charArr1[i+1] <= 'Z')) {
                union.add(String.valueOf(charArr1) + String.valueOf(charArr1));
            }else {
                continue;
            }
        }

        for(int i = 0 ; i < length2-1 ;i ++) {
            if((charArr2[i] >= 'A' && charArr2[i] <= 'Z') && (charArr2[i+1] >= 'A' && charArr2[i+1] <= 'Z')) {
                union.add(String.valueOf(charArr1) + String.valueOf(charArr1));
            }else {
                continue;
            }
        }



        return (int)(answer * 65536);
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
