package org.cian.exam.coding.programmers;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Level2 {
    class Solution121683 {
        public String solution(String input_string) {
            String answer = "";
            int[] cntArr = new int[26];
            char[] inputArr = input_string.toCharArray();
            int length = inputArr.length;

            for(char input : inputArr) cntArr[input-97]++;

            for(int i = 0 ; i < length ; i++) {
                int abcCnt = cntArr[inputArr[i]-97];
                if(abcCnt <= 1 || i == length - 1) continue;
                else if(abcCnt + i -1 > length) break;
                else {
                    for(int j = 1 ; j < abcCnt ; j++) {
                        if(inputArr[i] == inputArr[i+j]){
                            if(j == abcCnt-1) {
                                cntArr[inputArr[i]-97] = 0;
                                i = i + j - 1;
                            }
                            continue;
                        }else {
                            answer += inputArr[i];
                            cntArr[inputArr[i] -97] = 1;
                            break;
                        }
                    }
                }
            }
            if(answer.length() == 0) return "N";
            char[] answerArr = answer.toCharArray();
            Arrays.sort(answerArr);

            return String.valueOf(answerArr);
        }
    }
    class SolutionTestLev2_01 {
        public int solution(String dirs) {
            char[] directionArr = dirs.toCharArray();
            Set road = new HashSet();
            String crtPoint = "ff";

            for(char direction : directionArr) {
                char[] xyPoint = crtPoint.toCharArray();
                String startPoint = crtPoint;
                switch(direction) {
                    case 'U' :
                        if(xyPoint[1] == 107) continue;
                        xyPoint[1]++;
                        break;
                    case 'D' :
                        if(xyPoint[1] == 97) continue;
                        xyPoint[1]--;
                        break;
                    case 'R' :
                        if(xyPoint[0] == 107) continue;
                        xyPoint[0]++;
                        break;
                    case 'L' :
                        if(xyPoint[0] == 97) continue;
                        xyPoint[0]--;
                        break;
                }
                crtPoint = xyPoint[0] + "" + xyPoint[1];
                road.add(startPoint + crtPoint);
                road.add(crtPoint + startPoint);
            }

            return road.size()/2;
        }
    }

    public long solution140107(int k, int d) {
        long answer = 0;

        for(int i = 0 ; i <= d ; i = i+k) {
            answer += (int)Math.sqrt(Math.pow(d,2) - Math.pow(i,2)) / k + 1;
        }

        return answer;
    }

    // 다음 큰 숫자
    public int solution12911(int n) {
        int bitCount = Integer.bitCount(n);

        while(bitCount != Integer.bitCount(++n)) {}
        return n;
    }

    //땅따먹기
    int solution12913(int[][] land) {
        int answer = 0;
        int row = land.length;

        for(int i = 1 ; i < row ; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][2]);
        }

        for(int i = 0 ; i < 4 ; i++){
            answer = Math.max(answer, land[land.length - 1][i]);
        }

        return answer;
    }

    public int solution12924(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++) {
            int sum = 0;
            int num = i;
            while(sum < n) {
                sum += num;
                num++;
            }
            if(sum == n){
                answer++;
            }
        }
        return answer;
    }
    //주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있음.
    //주어진 자연수의 홀수 갯수로 확인

    //피보나치 BigInteger
    public int solution12945(int n) {
        BigInteger answer = BigInteger.valueOf(0);
        BigInteger f1 = BigInteger.valueOf(0);
        BigInteger f2 = BigInteger.valueOf(1);
        BigInteger num = BigInteger.valueOf(1234567);
        if(n == 2) return f2.intValue();
        int count = 1;
        while(count < n) {
            answer = f1.add(f2);
            f1 = f2;
            f2 = answer;
            count++;
        }

        return (answer.remainder(num)).intValue();
    }

    //행렬의 곱셈
    public int[][] solution12949(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0 ; i < arr1.length ; i++) {
            for(int j = 0 ; j < arr2[0].length ; j++) {
                for(int k = 0 ; k < arr2.length ; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

    //N개의 최소공배수
    public int solution12953(int[] arr) {
        int answer = 0;
        long mutipl = 1;
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++) {
            mutipl *= arr[i];
        }

        for(int i = arr[arr.length-1] ; i <= mutipl ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i % arr[j] != 0) {
                    break;
                }else if(j == arr.length -1 && i % arr[j] == 0) {
                    return i;
                }
            }
        }

        return answer;
    }
}
