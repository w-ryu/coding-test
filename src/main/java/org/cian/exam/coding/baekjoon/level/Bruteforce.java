package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bruteforce {

    public static void baek1436() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 666 ; i < 1000000 ; i++) {
            String str = String.valueOf(i);
            if(str.contains("666")){
                count++;
            }
            if(count == N) {
                System.out.println(i);
                break;
            }
        }
    }


    public static boolean[][] boardArr;
    public static int min = 64;

    public static void baek1018() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArrr = br.readLine().split(" ");

        int N = Integer.parseInt(strArrr[0]);
        int M = Integer.parseInt(strArrr[1]);

        boardArr = new boolean[N][M];


        for(int i = 0 ; i < N ; i++) {
            String boardLine = br.readLine();
            for(int j = 0 ; j < M ; j++) {
                if(boardLine.charAt(j) == 'W') {
                    boardArr[i][j] = true;
                }else {
                    boardArr[i][j] = false;
                }
            }
        }

        int nStart = N - 7;
        int mStart = M - 7;

        for(int i = 0 ; i < nStart ; i++) {
            for(int j = 0 ; j < mStart ; j++) {
                boardCheck(i, j);
            }
        }
        System.out.println(min);
    }

    static void boardCheck(int x, int y) {
        int xEnd = x + 8;
        int yEnd = y + 8;

        boolean boardFirst = boardArr[x][y];
        int count = 0;

        for(int i = x ; i < xEnd ; i++) {
            for(int j = y ; j < yEnd ; j++) {
                if(boardFirst != boardArr[i][j]) {
                    count++;
                }
                boardFirst = !boardFirst;
            }
            boardFirst = !boardFirst;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }


    public static void baek7568() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] kg = new int[N];
        int[] cm = new int[N];
        for(int i = 0 ; i < N ; i++) {
            String[] size = br.readLine().split(" ");
            kg[count] = Integer.parseInt(size[0]);
            cm[count++] = Integer.parseInt(size[1]);
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < N ; i++) {
            int rank = 1;
            for(int j = 0 ; j < N ; j++) {
                if(i == j) continue;
                if(kg[i] < kg[j] && cm[i] < cm[j]){
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }

    public static void baek2231() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ctor = 0;
        for(int i = 1 ; i <= N ; i++) {
            if(N == sum(i) + i) {
                ctor = i;
                break;
            }
        }
        System.out.println(ctor);
    }

    static int sum(int N) {
        if(N < 10) {
            return N;
        }
        return sum(N/10) + N%10;
    }

    public static void baek2798() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strNM = br.readLine().split(" ");
        int N = Integer.parseInt(strNM[0]);
        int M = Integer.parseInt(strNM[1]);

        String[] strCard = br.readLine().split(" ");
        int[] cardArr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            cardArr[i] = Integer.parseInt(strCard[i]);
        }

        Arrays.sort(cardArr);
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < N-2 ; i++) {
            for(int j = i+1 ; j < N-1 ; j++) {
                for(int k = j+1 ; k < N ; k++){
                    sum = cardArr[i] + cardArr[j] + cardArr[k];

                    if(M >= sum && sum >= max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
