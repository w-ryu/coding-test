package org.cian.exam.coding.baekjoon.level.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray1 = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String[] strArray2 = {"A", "B", "C", "D", "E", "F", "G", "H"};

        String S = br.readLine();
        for(int i = 0 ; i < strArray1.length ; i++) {
            S = S.replaceAll(strArray1[i], strArray2[i]);
        }

        System.out.println(S.toCharArray().length);
    }
}
