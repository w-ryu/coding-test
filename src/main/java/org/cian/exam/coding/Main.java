package org.cian.exam.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[][] filed;
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();
                int t = Integer.parseInt(br.readLine());
                for(int test = 0 ; test < t ; test++){
                    int answer = 0;
                    String[] strArr = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            int k = Integer.parseInt(strArr[2]);

            filed = new boolean[n][m];
            for(int i = 0 ; i < k ; i++) {
                String[] xyArr = br.readLine().split(" ");
                filed[Integer.parseInt(xyArr[0])][Integer.parseInt(xyArr[1])] = true;
            }

            for(int i = 0 ; i < n ; i++) {
                for(int j = 0 ; j < m ; j++) {
                    if(filed[i][j]){
                        group(i, j, n, m);
                        answer++;
                    }
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    static void group(int x, int y, int n, int m) {
        if(filed[x][y]) filed[x][y] = false;
        if(x < n-1 && filed[x+1][y]) group(x+1, y, n, m);
        if(x-1 >= 0 && filed[x-1][y]) group(x-1, y, n, m);
        if(y < m-1 && filed[x][y+1]) group(x, y+1, n, m);
        if(y-1 >= m && filed[x][y-1]) group(x, y-1, n, m);
    }

//    public static void main(String[] args) throws IOException {
//        Solution0000 solutionClass = new Solution0000();
//        Print print = new Print();
//        String s = "3people unFollowed me";
//        int n = 10;
//        int[] arr1 = {2,6,8,14};
//        int[] arr2 = {27 ,56, 19, 14, 14, 10};
//        int[][] sizes = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
//        String[] strArr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] strArr2 = {"josipa", "filipa", "marina", "nikola"};
//
//        String answer = solutionClass.solution(s);
//        print.print(answer);
//
//    }
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
