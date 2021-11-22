package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public void baek10989()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] intArray = new int[N];

        for(int i = 0 ; i < N ; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArray);
        StringBuffer sb = new StringBuffer();
        for (int num : intArray) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }

    public void baek2751()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> intList = new ArrayList();

        for(int i = 0 ; i < N ; i++) {
            intList.add(Integer.parseInt(br.readLine()));
        }

        intList = intList.stream().distinct().sorted().collect(Collectors.toList());

        StringBuffer sb = new StringBuffer();
        for (int num : intList) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
