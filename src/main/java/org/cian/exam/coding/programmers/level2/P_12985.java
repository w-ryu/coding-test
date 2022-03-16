package org.cian.exam.coding.programmers.level2;

/**
 * 예상대진표 [완]
 * BinaryString으로 다시 풀어보기
 */
public class P_12985 {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(a != b){
            a = (a+1)/2;
            b = (b+1)/2;
            ++answer;
        }
        return answer;
    }
}

//class Solution {
//    public int solution(int n, int a, int b) {
//        return Integer.toBinaryString((a-1)^(b-1)).length();
//    }
//}