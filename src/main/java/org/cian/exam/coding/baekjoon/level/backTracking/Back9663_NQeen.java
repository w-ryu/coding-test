package org.cian.exam.coding.baekjoon.level.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back9663_NQeen {
    public static int N;
    public static int count;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        queen(0);
        System.out.println(count);
    }

    public static void queen(int row) {
        if(row == N) {
            count++;
            return;
        }

        for(int i = 0 ; i < N ; i++) {
            arr[row] = i;
            if(possibility(row)){
                queen(row + 1);
            }
        }
    }

    public static boolean possibility(int col) {
        for(int i = 0 ; i < col ; i++) {
            if(arr[col] == arr[i]) {
                return false;
            } else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
