package org.cian.exam.coding.programmers;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Level2 {


    public int solution12924(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++) {
            int sum = 0;
            int num = i;
            while(sum < n) {
                sum += num;
                num++;
            }
            if(sum == n){
                answer++;
            }
        }
        return answer;
    }
    //주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있음.
    //주어진 자연수의 홀수 갯수로 확인

    //피보나치 BigInteger
    public int solution12945(int n) {
        BigInteger answer = BigInteger.valueOf(0);
        BigInteger f1 = BigInteger.valueOf(0);
        BigInteger f2 = BigInteger.valueOf(1);
        BigInteger num = BigInteger.valueOf(1234567);
        if(n == 2) return f2.intValue();
        int count = 1;
        while(count < n) {
            answer = f1.add(f2);
            f1 = f2;
            f2 = answer;
            count++;
        }

        return (answer.remainder(num)).intValue();
    }

    //행렬의 곱셈
    public int[][] solution12949(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0 ; i < arr1.length ; i++) {
            for(int j = 0 ; j < arr2[0].length ; j++) {
                for(int k = 0 ; k < arr2.length ; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

    //N개의 최소공배수
    public int solution12953(int[] arr) {
        int answer = 0;
        long mutipl = 1;
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++) {
            mutipl *= arr[i];
        }

        for(int i = arr[arr.length-1] ; i <= mutipl ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i % arr[j] != 0) {
                    break;
                }else if(j == arr.length -1 && i % arr[j] == 0) {
                    return i;
                }
            }
        }

        return answer;
    }
}
