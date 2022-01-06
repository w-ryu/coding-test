package org.cian.exam.coding.programmers;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Level1 {

    public int solution12928(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n / 2 ; i++) {
            if(n % i == 0) {
                int share = n / i;
                if(share < i) {
                    break;
                }
                if(share == i){
                    answer += i;
                }else{
                    answer += share + i;
                }
            }
        }

        return answer;
    }

    //System.out.println(c.sumDivisor(12)); 제곱근 으로 다시 풀기기

   //제일 작은 수 제거하기
    public int[] solution12935(int[] arr) {
        int[] answer;
        if(arr.length == 1) {
            return answer = new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int index = 0;
        answer = new int[arr.length - 1];
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == min){
                continue;
            }
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }

//    public int[] solution(int[] arr) {
//        if (arr.length <= 1) return new int[]{ -1 };
//        int min = Arrays.stream(arr).min().getAsInt();
//        return Arrays.stream(arr).filter(i -> i != min).toArray();
//    }

    //문자열 내 p와 y의 개수
    boolean solution12916(String s) {
        char[] charArr = s.toCharArray();
        int p = 0;
        int y = 0;
        for(char ch : charArr) {
            if(ch == 'p' || ch == 'P') p++;
            if(ch == 'y' || ch == 'Y') y++;
        }

        return p == y;
    }

//    boolean solution(String s) {
//        s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
//    }

    //시저암호
    public String solution12926(String s, int n) {
        String answer = "";
        for(int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                answer += ch;
                continue;
            }
            if(Character.isLowerCase(ch)){
                answer += (char)((ch - 'a' + n) % 26 + 'a');
            }else if(Character.isUpperCase(ch)) {
                answer += (char)((ch - 'A' + n) % 26 + 'A');
            }
        }

        return answer;
    }

    //없는 숫자 더하기
    class Solution0000 {
        public int solution(int[] numbers) {
            int sum = 45;
            for(int num : numbers) {
                sum -= num;
            }

            return sum;
        }
    }


//class Solution {
//    public int solution(int[] numbers) {
//        return IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
//    }
//}

    // 실패율
    public int[] solution42889(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] failRateArr = new Double[N];
        Double[] sortArr = new Double[N];
        for(int i = 1 ; i <= N ; i++) {
            double tryMems = 0;
            double successMems = 0;
            for(int stage : stages) {
                if(stage >= i) {
                    successMems++;
                }
                if(stage == i) {
                    tryMems++;
                }
            }
            if(successMems == 0) {
                failRateArr[i-1] = sortArr[i-1] = (double)0;
            }else {
                failRateArr[i-1] = sortArr[i-1] = tryMems / successMems;
            }
        }

        Arrays.sort(sortArr, Comparator.reverseOrder());

        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                if(sortArr[i] == failRateArr[j]) {
                    answer[i] = (int)j+1;
                    failRateArr[j] = (double)-1;
                }
            }
        }
        return answer;
    }

    //키패드 누르기
    public String solution67256(int[] numbers, String hand) {
        String answer = "";

        int leftHand = 10;
        int rightHand = 12;
        for(int num : numbers) {

            if(num == 0) {
                num = 11;
            }

            switch(num % 3) {
                case 1 :
                    answer += "L";
                    leftHand = num;
                    break;
                case 2 :
                    int leftLength = (Math.abs(num - leftHand) / 3) + (Math.abs(num - leftHand) % 3);
                    int rightLength = (Math.abs(num - rightHand) / 3) + (Math.abs(num - rightHand) % 3);
                    if(leftLength == rightLength){
                        if("right".equals(hand)){
                            answer += "R";
                            rightHand = num;
                        }else {
                            answer += "L";
                            leftHand = num;
                        }
                    }else if(leftLength > rightLength) {
                        answer += "R";
                        rightHand = num;
                    }else {
                        answer += "L";
                        leftHand = num;
                    }
                    break;
                default:
                    answer += "R";
                    rightHand = num;
                    break;
            }
        }
        return answer;
    }

    //숫자 문자열과 영단어
    public int solution81301(String s) {
        String[] wordArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0 ; i < 9 ; i++) {
            if(s.contains(wordArr[i])) {
                s = s.replaceAll(wordArr[i], ""+i);
            }
        }
        return Integer.parseInt(s);
    }

    public String solution72410(String new_id) {
        String answer = new_id.toLowerCase().replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        if(answer.equals("")){
            answer = "a";
        }

        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");

        while(answer.length() < 3) {
            answer += answer.substring(answer.length() - 1);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] result = new Level1.program77484().solution(lottos, win_nums);

        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    static class program77484 {
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
