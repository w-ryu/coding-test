package org.cian.exam.coding.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1 {
    public static void back4344()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            String[] A = br.readLine().split(" ");
            double num = 0;
            int cnt = 0;
            double subNum = Integer.parseInt(A[0]);
            for(int j = 1 ; j < A.length ; j++) {
                num += Integer.parseInt(A[j]);
            }

            double average = num / subNum;

            for(int k = 1 ; k < A.length ; k++){
                if(Integer.parseInt(A[k]) > average){
                    cnt++;
                }
            }
            double result = cnt * 100 / subNum;

            System.out.println(String.format("%.3f", result) + "%");
        }
    }
}
