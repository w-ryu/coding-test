package org.cian.exam.coding.baekjoon.level.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baek1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0 ; i < N ; i++) {
            char[] charArray = br.readLine().toCharArray();
            if(charArray.length < 3){
                result ++;
                continue;
            }
            int outCnt = 0;
            for(int j = 0 ; j < charArray.length - 1 ; j++) {
                int cnt = 0;
                if(outCnt > 0) {
                    break;
                }
                for(int k = j+1 ; k < charArray.length ; k++) {
                    if(cnt == 0 && charArray[j] == charArray[k]) {
                        continue;
                    }else if(cnt > 0 && charArray[j] == charArray[k]) {
                        outCnt++;
                    }else {
                        cnt++;
                    }
                }
            }
            if(outCnt == 0) {
                result ++;
            }
        }
        System.out.println(result);
    }
}
