package org.cian.exam.coding.baekjoon.level.function;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baek4673 {
    public static void main(String[] args) throws IOException {
        int N = 200;
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for(int i = 1 ; i <= N ; i++) {
            int sum = i + (i % 10) + ((i % 100) / 10) + ((i % 1000) / 100) + (i / 1000);
            A.add(sum);
        }
        Collections.sort(A);


        for(int j = 1 ; j <= N ; j++) {
            int cnt = 0;
            for(int k = 0 ; k < A.size() ; k++) {
                if(j == A.get(k)) {
                    cnt++;
                }
            }

            if(cnt == 0) {
                B.add(j);
            }
        }

        for(int j = 0 ; j < B.size() ; j++){
            System.out.println(B.get(j));
        }
    }
}
