package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure_200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * [에디터 (Iterator 사용)]
 */
public class Baek10845_Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int lastNum = 0;
        for(int i = 0 ; i < N ; i++) {
            String[] inputArr = br.readLine().split(" ");
            switch (inputArr[0]) {
                case "push":
                    lastNum = Integer.parseInt(inputArr[1]);
                    q.offer(lastNum);
                    break;
                case "pop":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(q.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()){
                        sb.append(1).append("\n");
                    }else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(q.isEmpty()) {
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(q.peek()).append("\n");
                    }
                    break;
                case "back":
                    if(q.isEmpty()) {
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(lastNum).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
