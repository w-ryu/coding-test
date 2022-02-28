package org.cian.exam.coding.baekjoon.level.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * [잃어버린 괄호] 완 / 실버2 / 14392KB / 136ms / 1475B
 */
public class Baek1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] numStrArr = inputStr.replaceAll("[\\-,+]", " ").split(" ");
        char[] codeArr = inputStr.replaceAll("[0-9]", "").toCharArray();
        int length = numStrArr.length;
        List<Integer> numList = new LinkedList<>();
        List<Character> codeList = new LinkedList<>();

        for(int i = 0 ; i < length ; i++) {
            numList.add(Integer.parseInt(numStrArr[i]));
            if(i < length-1) {
                codeList.add(codeArr[i]);
            }
        }

        length = codeList.size();
        for(int i = length-1 ; i >=0 ; i--) {
            if(codeList.get(i) == '+') {
                numList.set(i, numList.get(i) + numList.remove(i+1));
                codeList.remove(i);
            }
        }

        length = codeList.size();

        for(int i = length-1 ; i >=0 ; i--) {
            if(i == 0) {
                numList.set(i, numList.get(i) - numList.remove(i+1));
            }else {
                numList.set(i, numList.get(i) + numList.remove(i+1));
            }
            codeList.remove(i);
        }

        System.out.println(numList.get(0));
    }
}
