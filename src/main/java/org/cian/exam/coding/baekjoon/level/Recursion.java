package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Recursion {

    public static StringBuffer sb = new StringBuffer();
    public static void baek11729() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total = (int)Math.pow(2, N) - 1;
        sb.append(total).append("\n");
        hanoi(N, 1,2,3);
        System.out.println(sb);
    }

    static void hanoi(int N, int start, int via, int end) {
        if(N == 1) {
            sb.append(start + " " + end).append("\n");
            return;
        }

        hanoi(N - 1, start, end, via);

        sb.append(start + " " + end).append("\n");
        hanoi(N - 1 , via, start, end);
    }

    /**
     * baek2447
     * @throws IOException
     */
    static char[][] arr;

    public static void baek2447() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        star(0, 0, N, false);

        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void star(int x, int y, int N, boolean blank) {
        if(blank) {
            for(int i = x ; i < x + N ; i++) {
                for(int j = y ; j < y + N ; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(N == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;

        for(int i = x ; i < x + N ; i += size) {
            for(int j = y ; j < y + N ; j += size) {
                count++;
                if(count == 5) {
                    star(i, j, size, true);
                }else {
                    star(i, j, size, false);
                }
            }
        }
    }


    /**
     * baek10870
     * @throws IOException
     */
    public static void baek10870() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] intArray = new int[n+1];

        for(int i = 0 ; i < n+1 ; i++) {
            if(i == 0){
                intArray[i] = 0;
            }else if(i == 1) {
                intArray[i] = 1;
            }else {
                intArray[i] = intArray[i-1] + intArray[i-2];
            }
        }
        System.out.println(intArray[n]);
    }

    public static void baek10872() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 1; i <= N ; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
