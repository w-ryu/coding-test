package org.cian.exam.coding.programmers.level2;

import java.util.Stack;

/**
 * 기능개발 [완]
 * 기존 Array , list로 구현했지만 Stack이 좀더 코드가 간결해서 Stack으로 변경
 */
public class P_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        if (length == 1) {
            return new int[]{1};
        }

        Stack<Integer> st = new Stack<>();
        int maxDay = 0;
        int scope = 0;
        for(int i = 0 ; i < length ; i++) {
            int count = 0;
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                count++;
            }
            if(maxDay < count) {
                maxDay = count;
                if(i == 0) continue;
                st.push(i-scope);
                scope = i;
            }

            if(i == length - 1){
                st.push(i-scope+1);
            }
        }

        int[] functions = new int[st.size()];
        for(int i = st.size()-1 ; i >=0  ; i--) {
            functions[i] = st.pop();
        }

        return functions;
    }
}
