package org.cian.exam.coding.baekjoon.level.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [셀프 넘버] 완 / 실버5 / 13940KB / 120ms / 588B
 * 과거 - i의 자리수 관계없이 1000단위 이상 계산을 무조건 하게 되어있으며, System.out.print를 각 row를 출력할 때마다 호출
 * 현재 - while을 이용하여 효율적으로 n값이 0이되면 자동으로 다음 수 처리.
 *     - StringBuilder를 이용하여 속도 개선
 */
public class Baek4673 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        boolean[] numArr = new boolean[10036];

        for(int i = 1 ; i <= 10000 ; i++) {
            int n = i;
            int selfNum = i;
            while(n > 0) {
                selfNum += n % 10;
                n = n / 10;
            }
            numArr[selfNum] = true;
        }

        for(int i = 1 ; i <= 10000 ; i++) {
            if(!numArr[i]){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    /**
     * 15068KB / 388ms / 847B
     * 3달 전 소스
     */
    void before(){
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
