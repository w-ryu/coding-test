package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int first = Integer.parseInt(inputArr[0]);
        int[] numArr = new int[N-1];

        for(int i = 1 ; i < N ; i++) {
            numArr[i-1] = Integer.parseInt(inputArr[i]);
        }

        for(int i = 0 ; i < N-1 ; i++) {
            if (first % numArr[i] == 0) {
                sb.append(first / numArr[i]).append("/").append(1).append("\n");
                continue;
            } else if(numArr[i] % first == 0) {
                sb.append(1).append("/").append(numArr[i] / first).append("\n");
                continue;
            }else{
                for(int j = 2; j <= first ; j++) {
                    if(j == first) {
                        sb.append(first).append("/").append(numArr[i]).append("\n");
                    }else if(first * j % numArr[i] == 0) {
                        sb.append(first * j / numArr[i]).append("/").append(j).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}

