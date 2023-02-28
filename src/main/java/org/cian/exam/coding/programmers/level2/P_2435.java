package org.cian.exam.coding.programmers.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 124 좌표 [완]
 *
 *
 */
public class P_2435 {
    public int solution(int cacheSize, String[] cities) {
        List<String> list = new ArrayList<>();
        int len = cities.length;
        int answer = 0;

        if(cacheSize == 0) return len * 5;
        else {
            for(int i = 0 ; i < len ; i++) {
                String city = cities[i].toLowerCase();
                if(list.contains(city)){
                    list.remove(city);
                    list.add(city);
                    answer += 1;
                }else {
                    if(cacheSize > list.size()) {
                        list.add(city);
                        answer += 5;
                    }else {
                        list.add(city);
                        list.remove(0);
                        answer += 5;
                    }
                }
            }
        }
        return answer;
    }
}