package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Baek2751 {
    public static void main(String[] args) throws IOException {
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
