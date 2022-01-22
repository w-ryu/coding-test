package org.cian.exam.coding.baekjoon.level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Baek1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] numArr = new int[N];
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < N ; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
            if(max < numArr[i]) {
                max = numArr[i];
            }
        }
        boolean[] numCheck = new boolean[max+1];

        numCheck[0] = numCheck[1] = true;

        for(int i = 2 ; i <= Math.sqrt(max) ; i++) {
            if(numCheck[i]) {
                continue;
            }
            for(int j = i * 2 ; j <= max ; j += i) {
                numCheck[j] = true;
            }
        }

        for(int i = 0 ; i < N ; i++) {
            if(!numCheck[numArr[i]]) {
                answer++;
            }
        }
        System.out.println(answer);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        java.lang.String[] strArray = br.readLine().split(" ");
//        List<Integer> intList = new ArrayList<>();
//        int result = 0;
//
//        for(int i = 0 ; i < N ; i++) {
//            intList.add(Integer.parseInt(strArray[i]));
//        }
//        intList = intList.stream().sorted().collect(Collectors.toList());
//
//        for(int i = 0 ; i < intList.size() ; i++) {
//            int cnt = 1;
//            if(intList.get(i) == 1) {
//                continue;
//            }else if(intList.get(i) == 2 || intList.get(i) == 3) {
//                result++;
//                continue;
//            }
//
//            for(int j = 2 ; j <= intList.get(i) / 2 ; j++) {
//                if(intList.get(i) % j == 0) {
//                    cnt = 0;
//                    break;
//                }
//            }
//            if(cnt == 1) {
//                result++;
//            }
//        }
//
//        System.out.println("result = " + result);
//    }
}
