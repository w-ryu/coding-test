package org.cian.exam.coding.baekjoon.level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1018 {
    public static boolean[][] boardArr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
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
}
