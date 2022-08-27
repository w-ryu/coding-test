package org.cian.exam.coding.baekjoon.level.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * [수 찾기] - 완
 */
public class Baek1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        String[] nStrArr = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] mStrArr = br.readLine().split(" ");

        Map<String, Boolean> nMap = new HashMap();

        for(String strN : nStrArr) {
            nMap.put(strN, true);
        }

        for(String strM : mStrArr) {
            if(nMap.containsKey(strM) && nMap.get(strM)){
                sb.append(1).append("\n");
            }else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
