package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [GCD 합]
 * - 최대공약수는 재귀사용하여 구함
 */
public class Baek9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            String[] inputArr = br.readLine().split(" ");
            int numArrLnegth = Integer.parseInt(inputArr[0]);
            int[] numArr = new int[numArrLnegth];

            for(int j = 0 ; j < numArrLnegth ; j++) {
                numArr[j] = Integer.parseInt(inputArr[j+1]);
            }

            int result = 0;

            for(int j = 0 ; j < numArrLnegth - 1 ; j++) {
                for(int k = j+1 ; k < numArrLnegth ; k++) {
                    result += gcd(numArr[j], numArr[k]);
                }
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    public static long gcd(int a, int b) {
        if(b == 0) {
            return a;
        }else {
            return gcd(b, a%b);
        }
    }
}
