package org.cian.exam.coding.programmers.level2;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 124 좌표 [완]
 *
 *
 */
public class P_536 {
    public int solution(String dirs) {
        int answer = 0;
        char[] dirsArr = dirs.toCharArray();
        Set road = new HashSet<>();
        int sx = 0;
        int sy = 0;
        String sXY = "";
        String eXY = "";

        for(char dir : dirsArr) {
            int ex = sx;
            int ey = sy;
            switch(dir) {
                case 'U' :
                    if(ey < 5) ey++;
                    break;
                case 'D' :
                    if(ey > -5) ey--;
                    break;
                case 'R' :
                    if(ex < 5) ex++;
                    break;
                case 'L' :
                    if(ex > -5) ex--;
                    break;
            }
            sXY = sx + "" + sy;
            eXY = ex + "" + ey;
            sx = ex;
            sy = ey;
            if(!road.add(sXY + eXY) || !road.add(eXY + sXY)) continue;
            else answer++;
        }

        return answer;
    }
}