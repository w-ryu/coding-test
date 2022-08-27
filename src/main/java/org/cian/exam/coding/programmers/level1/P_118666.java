package org.cian.exam.coding.programmers.level1;

/**
 * 성격 유형 검사하기 [완]
 */
public class P_118666 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int choicesLen = choices.length;
        int[] typeScore = new int[4];
        char[] typeList = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        for(int i = 0 ; i < choicesLen ; i++) {
            choices[i] -= 4;
            char[] surveyCharList = survey[i].toCharArray();

            if(surveyCharList[0] > surveyCharList[1]) {
                choices[i] *= -1;
                Character tmp = surveyCharList[0];
                surveyCharList[0] = surveyCharList[1];
                surveyCharList[1] = tmp;
            }

            switch(surveyCharList[0]) {
                case 'R' :
                    typeScore[0] += choices[i];
                    break;
                case 'C' :
                    typeScore[1] += choices[i];
                    break;
                case 'J' :
                    typeScore[2] += choices[i];
                    break;
                case 'A' :
                    typeScore[3] += choices[i];
                    break;
            }
        }

        for(int i = 0 ; i < 4 ; i++) {
            answer += typeScore[i] <= 0 ? typeList[i * 2] : typeList[i * 2 + 1];
        }

        return answer;
    }
}
