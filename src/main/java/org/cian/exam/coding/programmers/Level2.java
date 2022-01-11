package org.cian.exam.coding.programmers;
import java.io.IOException;
import java.util.*;

public class Level2 {
    //N개의 최소공배수
    public int solution12953(int[] arr) {
        int answer = 0;
        long mutipl = 1;
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++) {
            mutipl *= arr[i];
        }

        for(int i = arr[arr.length-1] ; i <= mutipl ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i % arr[j] != 0) {
                    break;
                }else if(j == arr.length -1 && i % arr[j] == 0) {
                    return i;
                }
            }
        }

        return answer;
    }
}
