package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/**
 * [에디터 (Iterator 사용)]
 */
public class Baek1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Character> list = new LinkedList<>();
        char[] inputStrArr = br.readLine().toCharArray();
        int arrLength = inputStrArr.length;
        for(int i = 0 ; i < arrLength ; i++) {
            list.add(inputStrArr[i]);
        }
        int N = Integer.parseInt(br.readLine());
        int cursor = arrLength;

        ListIterator<Character> iter = list.listIterator();
        while(iter.hasNext()) {
            iter.next();
        }

        for(int i = 0 ; i < N ; i++) {
            char[] inputArr = br.readLine().toCharArray();

            switch(inputArr[0]) {
                case 'L':
                    if(iter.hasPrevious()) iter.previous();
                    break;
                case 'D':
                    if(iter.hasNext()) iter.next();
                    break;
                case 'B':
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    iter.add(inputArr[2]);
                    break;
            }
        }
        for(char ch : list) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
