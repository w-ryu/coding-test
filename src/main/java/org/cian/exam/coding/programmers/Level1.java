package org.cian.exam.coding.programmers;
import java.io.IOException;
import java.util.*;

public class Level1 {
    //완주하지 못한 선수
    public String solution42576(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int index = -1;
        for(int i = 0 ; i < completion.length ; i++) {
            if(participant[i].equals(completion[i])){
                index = i;
                break;
            }
        }
        if(index == -1) {
            index = participant.length - 1;
        }

        return participant[index];
    }

//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }

    // K번째수
    public int[] solution42748(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length ; i++) {
            int[] commandArr = commands[i];
            List<Integer> sortList = new ArrayList<>();
            for(int j = commandArr[0] - 1 ; j < commandArr[1] ; j++) {
                sortList.add(array[j]);
            }
            Collections.sort(sortList);
            answer[i] = sortList.get(commandArr[2]-1);
        }

        return answer;
    }

//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for(int i=0; i<commands.length; i++){
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//
//        return answer;
//    }

    //폰켓몬
    public int solution1845(int[] nums) {
        Arrays.sort(nums);
        int answer = 1;
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i-1] != nums[i]) {
                answer++;
            }
        }
        if(nums.length/2 < answer) {
            answer = nums.length/2;
        }
        return answer;
    }

//    public int solution(int[] nums) {
//        return Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.collectingAndThen(Collectors.toSet(),
//                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
//    }

    //모의고사
    public int[] solution(int[] answers) {
        int[] grade = new int[3];
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i = 0 ; i < answers.length ; i++) {
            if(answers[i] == A[i%5]) grade[0]++;
            if(answers[i] == B[i%8]) grade[1]++;
            if(answers[i] == C[i%10]) grade[2]++;
        }

        int max = Math.max(Math.max(grade[0], grade[1]), grade[2]);
        List<Integer> answerList = new ArrayList();
        if(max == grade[0]) answerList.add(1);
        if(max == grade[1]) answerList.add(2);
        if(max == grade[2]) answerList.add(3);

        int[] answer = new int[answerList.size()];
        for(int i = 0 ; i < answerList.size() ; i++) {
            answer[i] = answerList.get(i);
        }
        //    list.stream().mapToInt(i->i.intValue()).toArray();

        return answer;
    }



    // 최소직사각형
    public int solution86491(int[][] sizes) {
        int width = 0;
        int height = 0;
        for(int i = 0 ; i < sizes.length ; i++) {
            if(sizes[i][0] > sizes[i][1]){
                if(width < sizes[i][0]) {
                    width = sizes[i][0];
                }
                if(height < sizes[i][1]) {
                    height = sizes[i][1];
                }
            }else {
                if(width < sizes[i][1]) {
                    width = sizes[i][1];
                }
                if(height < sizes[i][0]) {
                    height = sizes[i][0];
                }
            }
        }
        return width * height;
    }

//    public int solution(int[][] sizes) {
//        return Arrays.stream(sizes).reduce((a, b) -> new int[]{
//                Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
//        }).map(it -> it[0] * it[1]).get();
//    }

    //비밀지도
    public String[] solution17681(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0 ; i < n ; i++) {
            char[] charArr1 = Integer.toBinaryString(arr1[i]).toCharArray();
            char[] charArr2 = Integer.toBinaryString(arr2[i]).toCharArray();
            char[] resultArr = new char[n];
            for(char a : charArr1) {
                System.out.print(a);
            }
            System.out.println();
            for(int j = n - 1 ; j >= 0 ; j--) {
                if(charArr1.length - n + j >= 0 && charArr1[j - (n - charArr1.length)] == '1'){
                    resultArr[j] = '#';
                }else if(charArr2.length - n + j >= 0 && charArr2[j - (n - charArr2.length)] == '1') {
                    resultArr[j] = '#';
                }else {
                    resultArr[j] = ' ';
                }
            }
            answer[i] = new String(resultArr);
        }

        return answer;
    }

//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
//    }

    //다트게임
    public int solution17682(String dartResult) {
        char[] charArr = dartResult.toCharArray();
        int[] gradeArr = new int[3];
        int length = charArr.length;
        int answer = 0;
        int count = 0;

        for(int i = 0 ; i < length ; i++) {
            char c = charArr[i];

            switch(c) {
                case 'S':
                    gradeArr[count - 1] *= 1;
                    break;
                case 'D':
                    gradeArr[count - 1] *= gradeArr[count - 1];
                    break;
                case 'T':
                    gradeArr[count - 1] *= gradeArr[count - 1] * gradeArr[count - 1];
                    break;
                case '*':
                    gradeArr[count - 1] *= 2;
                    if(count != 1) {
                        gradeArr[count - 2] *= 2;
                    }
                    break;
                case '#':
                    gradeArr[count - 1] *= -1;
                    break;
                default:
                    if(i > 0 && charArr[i-1] == '1' && charArr[i] == '0'){
                        gradeArr[count - 1] = 10;
                    }else {
                        gradeArr[count] = Character.getNumericValue(c);
                        count++;
                    }
                    break;
            }
        }

        for(int a : gradeArr) {
            answer += a;
        }
        return answer;
    }

    //문자열 비교
    public String[] solution12915(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);
                if(c1 == c2){
                    return o1.compareTo(o2);
                }else {
                    return c1 - c2;
                }
            }
        });
        return strings;
    }

    public String solution12917(String s) {
        String[] strArr = s.split("");
        Arrays.sort(strArr, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String str : strArr) {
            sb.append(str);
        }

        return sb.toString();
    }


    public long solution12933(long n) {
        char[] strN = String.valueOf(n).toCharArray();
        Arrays.sort(strN);
        StringBuilder sb = new StringBuilder(new String(strN));

        return Long.valueOf(sb.reverse().toString());
    }

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
