package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//네수
public class Baek10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] strArr = br.readLine().split(" ");
        System.out.println(Long.parseLong(strArr[0] + strArr[1]) + Long.parseLong(strArr[2] + strArr[3]));
    }
}
