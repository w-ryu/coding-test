package org.cian.exam.coding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        int s = 25;
        int answer = solutionClass.solution(s);
        System.out.println(answer);
//        for(int a : answer) {
//            System.out.print(a + ", ");
//        }
    }
}

class Solution0000 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n / 2 ; i++) {
            if(n % i == 0) {
                int share = n / i;
                if(share < i) {
                    break;
                }
                if(share == i){
                    answer += i;
                }else{
                    answer += share + i;
                }
            }
        }

        return answer;
    }
}
