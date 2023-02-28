package org.cian.exam.coding.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 124 좌표 [완]
 *
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int len = nums.length;
        for(int i = 0 ; i < len - 1 ; i++) {
            for(int j = i+1 ; j < len ; j++) {
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
}