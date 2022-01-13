package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int N = 9;
    public static int count = 0;
    public static int[][] sudokuArr;
    public static int[] numArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudokuArr = new int[N][N];

        for(int i = 0 ; i < N ; i++) {
            String[] inputArr = br.readLine().split(" ");
            for(int j = 0 ; j < N ; j++) {
                sudokuArr[i][j] = Integer.parseInt(inputArr[j]);
                if(Integer.parseInt(inputArr[j]) == 0){
                    count++;
                }
            }
        }
    }
}

