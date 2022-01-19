package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//요세푸스
public class Baek1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputArr = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr[0]);
        int K = Integer.parseInt(inputArr[1]);
        List<Integer> list = new LinkedList<>();

        for(int i = 1 ; i <= N ; i++) {
            list.add(i);
        }

        sb.append("<");

        Iterator<Integer> iter = list.listIterator();
        while(true) {
            int count = K;
            while(count > 0) {
                if(!iter.hasNext()){
                    iter = list.listIterator();
                }
                if(count == 1) {
                    sb.append(iter.next());
                }else {
                    iter.next();
                }

                count--;
            }

            iter.remove();

            if(list.size() == 0){
                break;
            }else {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
