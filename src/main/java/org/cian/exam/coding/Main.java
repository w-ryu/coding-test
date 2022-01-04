package org.cian.exam.coding;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        int N = 5;
        int[] numbers = {4,4,4,4,4};
        int[] answer = solutionClass.solution(N, numbers);

        for(int a : answer){
            System.out.print(a + ", ");
        }
    }
}

class Solution0000 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] failRateArr = new Double[N];
        Double[] sortArr = new Double[N];
        for(int i = 1 ; i <= N ; i++) {
            double tryMems = 0;
            double successMems = 0;
            for(int stage : stages) {
                if(stage >= i) {
                    successMems++;
                }
                if(stage == i) {
                    tryMems++;
                }
            }
            if(successMems == 0) {
                failRateArr[i-1] = sortArr[i-1] = (double)0;
            }else {
                failRateArr[i-1] = sortArr[i-1] = tryMems / successMems;
            }
        }

        Arrays.sort(sortArr, Comparator.reverseOrder());

        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                if(sortArr[i] == failRateArr[j]) {
                    answer[i] = (int)j+1;
                    failRateArr[j] = (double)-1;
                }
            }
        }
        return answer;
    }
}

