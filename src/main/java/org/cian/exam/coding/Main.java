package org.cian.exam.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 9;
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


        for(int i = 0 ; i < N ; i++){
            int cnt = 0;
            double left;
            double right;
            for(int k = exponent ; k > 0 ; k--){
                if(i > (Math.pow(3, k) - 1) - 1 || i <= (Math.pow(3, k-1) - 1)) {
                    continue;
                }

                left = Math.pow(3, k-1) - 1;
                right = Math.pow(3, k) - Math.pow(3, k-1) - 1;

                if(i > left && i <= right) {
                    cnt = 1;
                }
            }

            if(cnt != 1){
                continue;
            }

            for(int j = 0 ; j < N ; j++) {
                cnt = 1;
                for(int l = exponent ; l > 0 ; l--){
                    if(j > (Math.pow(3, l) - 1) - 1 || j <= (Math.pow(3, l-1) - 1)) {
                        continue;
                    }
                    System.out.println("(Math.pow(3, k) - 1) - 1 = " + ((Math.pow(3, l) - 1) - 1));
                    System.out.println("(Math.pow(3, k-1) - 1) = " + (Math.pow(3, l-1) - 1));
                    left = Math.pow(3, l-1) - 1;
                    right = Math.pow(3, l) - Math.pow(3, l-1) - 1;
                    System.out.println("left = " + left + ", right = " + right);
                    if(j > left && j <= right) {
                        cnt++;
                    }
                }

                if(cnt == 2) {
                    starArray[i][j] = false;
                }
            }
        }


        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++) {
                if(starArray[i][j]) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
