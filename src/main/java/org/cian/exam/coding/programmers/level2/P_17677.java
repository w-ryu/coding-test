package org.cian.exam.coding.programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * [1차] 뉴스 클러스터링 [완]
 * DFS / 완전탐색 사용
 */
public class P_17677 {
    public int solution(String str1, String str2) {
        double answer = 0;
        str1 = str1.toUpperCase(Locale.ROOT);
        str2 = str2.toUpperCase(Locale.ROOT);

        int length1 = str1.length();
        int length2 = str2.length();

        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for(int i = 0 ; i < length1-1 ;i ++) {
            char char1 = str1.charAt(i);
            char char2 = str1.charAt(i+1);
            if(Character.isLetter(char1) && Character.isLetter(char2)) {
                String str = String.valueOf(char1) + String.valueOf(char2);
                list1.add(str);
            }else {
                continue;
            }
        }

        for(int i = 0 ; i < length2-1 ;i ++) {
            char char1 = str2.charAt(i);
            char char2 = str2.charAt(i+1);
            if(Character.isLetter(char1) && Character.isLetter(char2)) {
                String str = String.valueOf(char1) + String.valueOf(char2);
                list2.add(str);
            }else {
                continue;
            }
        }

        for(String str : list1) {
            if(list2.remove(str)) {
                intersection.add(str);
            }
            union.add(str);
        }

        for(String str : list2) {
            union.add(str);
        }
        if(list1.size() == 0 && list2.size() == 0) {
            answer = 1;
        }else {
            answer = (double)intersection.size() / union.size();
        }

        return (int)(answer * 65536);
    }
}