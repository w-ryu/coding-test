package org.cian.exam.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int[] changeArr = intArr;
        changeArr = IntStream.of(intArr).distinct().sorted().toArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < changeArr.length ; j++) {
                if(intArr[i] == changeArr[j]) {
                    sb.append(j).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}
