package org.cian.exam.coding.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 가장 큰 수 [완-다시]
 * 정렬 - Arrays Comparator 사용
 */
public class P_42746 {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        int length = numbers.length;

        if(length == 1) return String.valueOf(numbers[0]);

        String[] arr = new String[length];

        for(int i = 0 ; i < length ; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if("0".equals(arr[0])) return "0";

        for(String str : arr) {
            sb.append(str);
        }

        return sb.toString();
    }
}