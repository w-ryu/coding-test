package org.cian.exam.coding.book.thisisct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chapter03 {
    public void Quiz02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String[] varArr = br.readLine().split(" ");
        int N = Integer.parseInt(varArr[0]);
        int M = Integer.parseInt(varArr[1]);

        for(int i = 0 ; i < N ; i++) {
            String[] numArr = br.readLine().split(" ");
            int min = 10001;
            for(int j = 0 ; j < M ; j++) {
                int num = Integer.parseInt(numArr[j]);
                if(min > num) min = num;
            }
            if(answer < min) answer = min;
        }

        System.out.println(answer);
    }

    public void Quiz01Another() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String[] inputArr1 = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr1[0]);
        int M = Integer.parseInt(inputArr1[1]);
        int K = Integer.parseInt(inputArr1[2]);

        String[] inputArr2 = br.readLine().split(" ");
        int[] numArr = new int[N];
        for(int i = 0 ; i < N ; i++) numArr[i] = Integer.parseInt(inputArr2[i]);
        Arrays.sort(numArr);
        int max = numArr[N-1];
        int pass = numArr[N-2];

        answer += (max * K + pass) * (M / (K+1));
        if(M % K > 0) answer += max * (M % (K+1));

        System.out.println(answer);
    }

    public void Quiz01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String[] inputArr1 = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr1[0]);
        int M = Integer.parseInt(inputArr1[1]);
        int K = Integer.parseInt(inputArr1[2]);

        String[] inputArr2 = br.readLine().split(" ");
        int[] numArr = new int[N];
        for(int i = 0 ; i < N ; i++) numArr[i] = Integer.parseInt(inputArr2[i]);
        Arrays.sort(numArr);
        int max = numArr[N-1];
        int pass = numArr[N-2];

        for(int i = 1 ; i <= M ; i++) {
            if(i % K == 0) {
                answer += pass;
            }else {
                answer += max;
            }
        }

        System.out.println(answer);
    }
}
