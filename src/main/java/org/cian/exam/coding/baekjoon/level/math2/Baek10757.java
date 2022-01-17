package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Boolean[][] starArray = new Boolean[N][N];
        for (Boolean[] booleans : starArray) {
            Arrays.fill(booleans, Boolean.TRUE);
        }

        int exponent = 0;
        int n = 1;
        while(n != N) {
            n *= 3;
            exponent++;
        }

        for(int i = 0 ; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                for(int k = 1 ; k <= exponent ; k++) {
                    if (!starArray[i][j]) {
                        continue;
                    }
                    for(int l = 0 ; l < Math.pow(3, exponent - k) ; l++) {
                        if (!starArray[i][j]) {
                            continue;
                        }

                        double left_l = (l * Math.pow(3, k)) + Math.pow(3, k-1) - 1;
                        double right_l = (l+1) * Math.pow(3, k) - Math.pow(3, k-1) - 1;

                        if(i <= left_l || i > right_l){
                            continue;
                        }

                        Boolean blankA = true;
                        if(i > left_l && i <= right_l) {
                            blankA = false;
                        }


                        for(int m = 0 ; m < Math.pow(3, exponent - k) ; m++) {
                            double left_m = (m * Math.pow(3, k)) + Math.pow(3, k-1) - 1;
                            double right_m = (m+1) * Math.pow(3, k) - Math.pow(3, k-1) - 1;
                            if(j <= left_m || j > right_m){
                                continue;
                            }

                            Boolean blankB = true;

                            if (j > left_m && j <= right_m) {
                                blankB = false;
                            }

                            if (!blankA && !blankB) {
                                starArray[i][j] = false;
                            }
                        }
                    }
                }
            }
        }

        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++) {
                if(starArray[i][j]) {
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
