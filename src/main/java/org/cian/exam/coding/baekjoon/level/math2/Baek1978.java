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
        int N = Integer.parseInt(br.readLine());
        java.lang.String[] strArray = br.readLine().split(" ");
        List<Integer> intList = new ArrayList<>();
        int result = 0;

        for(int i = 0 ; i < N ; i++) {
            intList.add(Integer.parseInt(strArray[i]));
        }
        intList = intList.stream().sorted().collect(Collectors.toList());

        for(int i = 0 ; i < intList.size() ; i++) {
            int cnt = 1;
            if(intList.get(i) == 1) {
                continue;
            }else if(intList.get(i) == 2 || intList.get(i) == 3) {
                result++;
                continue;
            }

            for(int j = 2 ; j <= intList.get(i) / 2 ; j++) {
                if(intList.get(i) % j == 0) {
                    cnt = 0;
                    break;
                }
            }
            if(cnt == 1) {
                result++;
            }
        }

        System.out.println("result = " + result);
    }
}
