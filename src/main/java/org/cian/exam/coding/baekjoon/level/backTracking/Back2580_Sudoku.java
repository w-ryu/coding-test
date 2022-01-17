package org.cian.exam.coding.baekjoon.level.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2580_Sudoku {
    public static int N = 9;
    public static int[][] sudokuArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudokuArr = new int[N][N];

        for(int i = 0 ; i < N ; i++) {
            String[] inputArr = br.readLine().split(" ");
            for(int j = 0 ; j < N ; j++) {
                sudokuArr[i][j] = Integer.parseInt(inputArr[j]);
            }
        }
        sudoku(0, 0);
    }

    public static void sudoku(int row, int col) {
        if(col == N) {
            sudoku(row + 1, 0);
            return;
        }
        if(row == N) {
            StringBuilder sb = new StringBuilder();
            for(int[] rowArr : sudokuArr){
                for(int colNum : rowArr) {
                    sb.append(colNum).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }
        if(sudokuArr[row][col] == 0) {
            for(int i = 1 ; i <= N ; i++) {
                if(numCheck(row, col, i)) {
                    sudokuArr[row][col] = i;
                    sudoku(row, col+1);
                }
            }
            sudokuArr[row][col] = 0;
            return;
        }
        sudoku(row, col+1);
    }
    public static boolean numCheck(int row, int col, int value) {
        for(int i = 0 ; i < N ; i++) {
            if(sudokuArr[row][i] == value) {
                return false;
            }
        }

        for(int i = 0 ; i < N ; i++) {
            if(sudokuArr[i][col] == value) {
                return false;
            }
        }

        int sRow = (row / 3) * 3;
        int sCol = (col / 3) * 3;

        for(int i = sRow ; i < sRow+3 ; i++) {
            for(int j = sCol ; j < sCol+3 ; j++) {
                if(sudokuArr[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
