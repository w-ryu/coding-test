package org.cian.exam.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
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
}
