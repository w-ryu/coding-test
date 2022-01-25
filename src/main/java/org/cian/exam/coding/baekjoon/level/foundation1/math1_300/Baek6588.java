package org.cian.exam.coding.baekjoon.level.foundation1.math1_300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * [골드바흐의 추측]
 * - list사용해서 contain사용하면 느림
 * - 바로 Array로 유무 확인해서 처리
 * - 1000000을 설정하는 것보다 값 중에서 max값을 기준으로 소수배열 처리하는게 더 효율적임
 */
public class Baek6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> nList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(max < N) {
                max = N;
            }
            nList.add(N);
            if(N == 0) {
                break;
            }
        }

        int nListSize = nList.size();

        boolean[] numCheckArr = new boolean[max + 1];
        numCheckArr[0] = numCheckArr[1] = true;
        for(int i = 2 ; i <= Math.sqrt(max) ; i++) {
            for(int j = i * 2 ; j <= max ; j += i) {
                numCheckArr[j] = true;
            }
        }

        for(int i = 0 ; i < nListSize ; i++) {
            int n = nList.get(i);
            for(int j = 3 ; j <= n ; j += 2) {
                if(!numCheckArr[j] && !numCheckArr[n-j]){
                    sb.append(n)
                            .append(" = ")
                            .append(j)
                            .append(" + ")
                            .append(n - j)
                            .append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
