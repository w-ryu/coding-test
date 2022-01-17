package org.cian.exam.coding.baekjoon.level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baek1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            java.lang.String[] strArray = br.readLine().split(" ");
            int x = Integer.parseInt(strArray[0]);
            int y = Integer.parseInt(strArray[1]);
            int length = y-x;

            double size = Math.round(Math.sqrt(length));
            int num = 0;


            if((size * size) - size < length && size * size >= length ) {
                num = (int)size * 2 - 1;
            }else if(size * size < length &&  (size * size) + size >= length) {
                num = (int)size * 2;
            }
            System.out.println(num);
        }
    }
}
