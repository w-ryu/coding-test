package org.cian.exam.coding.programmers.level2;

import java.util.Arrays;

/**
 * 전화번호 목록 [완-해시다시]
 * 해시로 다시 구현
 */
public class P_42577 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i = 0 ; i < phone_book.length ; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return true;
    }
}