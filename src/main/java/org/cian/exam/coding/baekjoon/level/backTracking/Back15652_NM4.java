package org.cian.exam.coding.baekjoon.level.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back15652_NM4 {
    // N과 M(4)[실버3] 17652KB / 156ms / 1050B
    public static int N, M;
    public static int[] numArr;
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        N = Integer.parseInt(inputArr[0]);
        M = Integer.parseInt(inputArr[1]);
        numArr = new int[M];
        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int depth) {
        if(depth == M) {
            for(int num : numArr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i  = 0 ; i < N ; i++) {
            numArr[depth] = i+1;
            dfs(depth+1);
        }
    }
}
