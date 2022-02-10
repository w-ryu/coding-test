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
        int[] arr1 = {1,2,3,4,6,7,8,0};
        int[] arr2 = {3,4};
        int[][] sizes1 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] sizes2 = {{3,3},{3,3}};
        String[] strArr1 = {"97674223", "119", "1195524421"};
        String[] strArr2 = {"eden", "kiki"};

        boolean answer = solutionClass.solution(strArr1);
        print.print(answer);

    }
}

class Solution0000 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i = 0 ; i < phone_book.length ; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return true;
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
