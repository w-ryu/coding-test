package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baek18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int[] originIntArr = new int[N];
        int[] orderIntArr = new int[N];

        Map changeMap = new HashMap();
        for(int i = 0 ; i < N ; i++) {
            originIntArr[i] = orderIntArr[i] = Integer.parseInt(strArr[i]);
        }

        orderIntArr = Arrays.stream(orderIntArr).sorted().distinct().toArray();

        int index = 0;

        for(int v : orderIntArr) {
            changeMap.put(v, index);
            index++;
        }

        StringBuilder sb = new StringBuilder();

        for(int key : originIntArr) {
            sb.append(changeMap.get(key) + " ");
        }
        System.out.println(sb);
    }
}
