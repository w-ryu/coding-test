package org.cian.exam.coding.baekjoon.level.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek9184 {
    public static StringBuilder sb = new StringBuilder();
    public static int[][][] arr = new int[21][21][21];
    public static int A, B, C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {

            String[] inputArr = br.readLine().split(" ");
            A = Integer.parseInt(inputArr[0]);
            B = Integer.parseInt(inputArr[1]);
            C = Integer.parseInt(inputArr[2]);
            if(A == -1 && B == -1 && C == -1) {
                break;
            }
            sb.append("w(")
                    .append(A)
                    .append(", ")
                    .append(B)
                    .append(", ")
                    .append(C)
                    .append(") = ")
                    .append(w(A, B, C))
                    .append("\n");
        }
        System.out.println(sb);
    }

    public static int w(int a, int b, int c) {
        if(scopeCheck(a, b, c) && arr[a][b][c] != 0) {
            return arr[a][b][c];
        }
        if(a <= 0 || b  <= 0 || c  <= 0) {
            return 1;
        }else if(a > 20 || b > 20 || c > 20) {
            return arr[20][20][20] = w(20, 20, 20);
        }else if(a < b && b < c) {
            return arr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }
        return arr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }

    public static boolean scopeCheck(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}
