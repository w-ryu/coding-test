package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = -1;
        while(n != 0){
            int cnt = 0;
            n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            Boolean[] prime = new Boolean[2 * n + 1];
            Arrays.fill(prime, Boolean.FALSE);

            prime[0] = prime[1] = true;

            for(int i = 2 ; i < Math.sqrt(prime.length) ; i++) {
                if(prime[i]){
                    continue;
                }

                for(int j = i * i ; j < prime.length ; j = j + i) {
                    prime[j] = true;
                }
            }

            for(int i = n + 1 ; i < prime.length ; i++){
                if(!prime[i]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
