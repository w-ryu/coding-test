package org.cian.exam.coding.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Function {
    public static void back1065() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int result = 0;

        if(N < 100) {
            result = N;
        }else{
            for(int i = 100 ; i <= N ; i++) {
                int first = ((i % 1000) / 100) - ((i % 100) / 10);
                int second = ((i % 100) / 10) - (i % 10);

                if(first == second){
                    cnt ++;
                }
            }
            result = 99 + cnt;
        }

        if(N == 1000){result -= 1;}

        System.out.println("result = " + result);

    }

    public static void back4673() {
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
