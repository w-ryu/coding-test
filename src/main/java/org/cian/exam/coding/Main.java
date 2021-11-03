package org.cian.exam.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
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

        for(int i = 1 ; i <= exponent ; i++) {
            for(int j = 0 ; j < Math.pow(3, exponent - i) ; j++) {

                double left = (j * Math.pow(3, i)) + Math.pow(3, i-1) - 1;
                double right = (j+1) * Math.pow(3, i) - Math.pow(3, i-1) - 1;

                for(int k = 0 ; k < N ; k++) {
                    Boolean blankA = true;
                    if(k > left && k <= right) {
                        blankA = false;
                    }
                    for(int m = 0 ; m < Math.pow(3, exponent - i) ; m++) {

                        double left_row = (m * Math.pow(3, i)) + Math.pow(3, i - 1) - 1;
                        double right_row = (m + 1) * Math.pow(3, i) - Math.pow(3, i - 1) - 1;

                        for (int l = 0; l < N; l++) {
                            Boolean blankB = true;
                            if (!starArray[k][l]) {
                                continue;
                            }
                            if (l > left_row && l <= right_row) {
                                blankB = false;
                            }
                            if (!blankA && !blankB) {
                                starArray[k][l] = false;
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
