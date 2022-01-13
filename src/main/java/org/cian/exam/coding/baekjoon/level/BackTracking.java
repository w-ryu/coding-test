package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackTracking {

    // N과 M(4)[실버3] 17652KB / 156ms / 1050B
    public static int N, M;
    public static int[] numArr;
    public static StringBuilder sb = new StringBuilder();
    public static void baek15652() throws IOException {
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

    // N과 M(3)[실버3] 68616KB / 488ms / 938B
//    public static int N, M;
//    public static int[] numArr;
//    public static StringBuilder sb = new StringBuilder();
//    public static void baek15651() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] inputArr = br.readLine().split(" ");
//        N = Integer.parseInt(inputArr[0]);
//        M = Integer.parseInt(inputArr[1]);
//        numArr = new int[M];
//        dfs(0);
//        System.out.println(sb);
//    }
//    public static void dfs(int depth) {
//        if(depth == M) {
//            for(int num : numArr) {
//                sb.append(num).append(" ");
//            }
//            sb.append("\n");
//            return;
//        }
//
//        for(int i  = 0 ; i < N ; i++) {
//            numArr[depth] = i+1;
//            dfs(depth+1);
//        }
//    }

    // N과 M(2)[실버3] 14204KB / 128ms / 1271B
//    public static int N, M;
//    public static boolean[] visitArr;
//    public static int[] numArr;
//    public static StringBuilder sb = new StringBuilder();
//    public static void baek15650() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] inputArr = br.readLine().split(" ");
//        N = Integer.parseInt(inputArr[0]);
//        M = Integer.parseInt(inputArr[1]);
//
//        visitArr = new boolean[N];
//        numArr = new int[M];
//        dfs(0);
//
//        System.out.println(sb);
//    }
//    public static void dfs(int depth) {
//        if(depth == M) {
//            for(int num : numArr) {
//                sb.append(num).append(" ");
//            }
//            sb.append("\n");
//            return;
//        }
//
//        for(int i = 0 ; i < N ; i++) {
//            if(visitArr[i] == false) {
//                visitArr[i] = true;
//                numArr[depth] = i+1;
//                dfs(depth+1);
//                visitArr[i] = false;
//            }
//        }
//    }

    // N과 M(1)[실버3] 22904KB / 272ms / 1166B
//    public static int N, M;
//    public static boolean[] visitArr;
//    public static int[] numArr;
//    public static StringBuilder sb = new StringBuilder();
//    public static void baek15649() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] inputArr = br.readLine().split(" ");
//        N = Integer.parseInt(inputArr[0]);
//        M = Integer.parseInt(inputArr[1]);
//
//        visitArr = new boolean[N];
//        numArr = new int[M];
//        dfs(0);
//
//        System.out.println(sb);
//    }
//    public static void dfs(int depth) {
//        if(depth == M) {
//            for(int num : numArr) {
//                sb.append(num).append(" ");
//            }
//            sb.append("\n");
//            return;
//        }
//
//        for(int i = 0 ; i < N ; i++) {
//            if(visitArr[i] == false) {
//                visitArr[i] = true;
//                numArr[depth] = i+1;
//                dfs(depth+1);
//                visitArr[i] = false;
//            }
//        }
//    }
}
