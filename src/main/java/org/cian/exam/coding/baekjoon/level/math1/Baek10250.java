package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0 ; t < T ; t++) {
            java.lang.String[] strArray = br.readLine().split(" ");
            int H = Integer.parseInt(strArray[0]);
            int W = Integer.parseInt(strArray[1]);
            int N = Integer.parseInt(strArray[2]);
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < W ; i++) {
                int left = H * i;
                int right = H * (i + 1);
                if(left < N && right >= N) {
                    int floor = N - left;
                    int room = i + 1;

                    if(room < 10) {
                        sb.append(floor)
                                .append("0")
                                .append(room);
                    }else {
                        sb.append(floor)
                                .append(room);
                    }
                    break;
                }
            }
            System.out.println(sb);
        }
    }
}
