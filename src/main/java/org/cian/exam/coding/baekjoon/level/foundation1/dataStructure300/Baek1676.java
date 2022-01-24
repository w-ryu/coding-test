package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [N! 끝에서 부터 0이 아닌 수까지의 0의 개수]
 * - 기존 풀이 방식은 BigInteger로 값을 구한 후 뒤에서 부터 0 count
 * - 다른 풀이 방식은 곱하는 수의 5를 나눈 몫으로 0을 카운트하는 방식
 * - 내것보다 이게 더 좋은듯
 */
public class Baek1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }

        System.out.println(count);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        BigInteger fac = new BigInteger("1");
//        int count = 0;
//
//        for(int i = 1 ; i <= N ; i++) {
//            BigInteger bigI = new BigInteger(String.valueOf(i));
//            fac = fac.multiply(bigI);
//        }
//
//        char[] numArr = String.valueOf(fac).toCharArray();
//        int numArrLength = numArr.length;
//        for(int i = numArrLength - 1 ; i >= 0  ; i--) {
//            if(numArr[i] == '0'){
//                count++;
//            }else {
//                break;
//            }
//        }
//        System.out.println(count);
    }
}
