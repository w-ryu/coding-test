package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure_200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * [덱]
 */
public class Baek10866_Deque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N ; i++) {
            String[] inputArr = br.readLine().split(" ");
            int num;
            switch(inputArr[0]) {
                case "push_front":
                    num = Integer.parseInt(inputArr[1]);
                    list.add(0, num);
                    break;
                case "push_back":
                    num = Integer.parseInt(inputArr[1]);
                    list.add(num);
                    break;
                case "pop_front":
                    sb.append(list.isEmpty() ? -1 : list.remove(0)).append("\n");
                    break;
                case "pop_back":
                    sb.append(list.isEmpty() ? -1 : list.remove(list.size()-1)).append("\n");
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    sb.append(list.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(list.isEmpty() ? -1 : list.get(0)).append("\n");
                    break;
                case "back":
                    sb.append(list.isEmpty() ? -1 : list.get(list.size()-1)).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
