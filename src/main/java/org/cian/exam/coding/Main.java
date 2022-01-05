package org.cian.exam.coding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution0000 solutionClass = new Solution0000();
        int[] s = {1,2,3,4};
        int[] answer = solutionClass.solution(s);
        //System.out.println(answer);
        for(int a : answer) {
            System.out.print(a + ", ");
        }
    }
}

class Solution0000 {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1) {
            return answer = new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int index = 0;
        answer = new int[arr.length - 1];
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == min){
                continue;
            }
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }
}
