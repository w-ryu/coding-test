package org.cian.exam.coding;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] result = new Solution().solution(lottos, win_nums);

        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            Arrays.sort(lottos);
            Arrays.sort(win_nums);

            int zeroCnt = 0;
            int matchCnt = 0;


            for(int i = 0 ; i < 6 ; i++) {
                if(lottos[i] == 0) {
                    zeroCnt++;
                    continue;
                }

                for(int j = 0 ; j < 6 ; j++) {
                    if(win_nums[j] == lottos[i]) {
                        matchCnt++;
                    }
                }
            }

            int[] answer = {grade(zeroCnt + matchCnt), grade(matchCnt)};
            return answer;
        }

        public int grade(int count) {
            int gradeNum = 0;
            switch(count) {
                case 6 :
                    gradeNum = 1;
                    break;
                case 5 :
                    gradeNum = 2;
                    break;
                case 4 :
                    gradeNum = 3;
                    break;
                case 3 :
                    gradeNum = 4;
                    break;
                case 2 :
                    gradeNum = 5;
                    break;
                default:
                    gradeNum = 6;
                    break;
            }
            return gradeNum;
        }
    }
}
