package org.cian.exam.coding.programmers.level2;

import java.util.Arrays;

/**
 * 소수찾기 [완]
 * 재귀로 풀었음
 * HashSet으로 다시 풀기
 */
public class P_42839 {
    public static boolean[] primeArr;
    public static char[] strArr;
    public static int answer = 0;
    public static boolean[] numCheck;
    public int solution(String numbers) {
        strArr = numbers.toCharArray();
        Arrays.sort(strArr);
        int max = Integer.parseInt(String.valueOf(new StringBuilder().append(strArr).reverse()));
        primeArr = new boolean[max+1];

        primeArr[0] = primeArr[1] = true;
        for(int i = 2 ; i <= Math.sqrt(max) ; i++) {
            if(primeArr[i]) continue;
            for(int j = i + i ; j <= max ; j += i) {
                primeArr[j] = true;
            }
        }

        int length = strArr.length;

        for(int i = 1 ; i <= length ; i++) {
            numCheck = new boolean[length];
            primeCheck("", i);
        }

        return answer;
    }

    public void primeCheck(String numStr, int size) {
        if(numStr.length() == size) {
            int num = Integer.parseInt(numStr);
            if(!primeArr[num]){
                answer++;
                primeArr[num] = true;
            }
            return;
        }

        int length = strArr.length;
        for(int i = 0 ; i < length ; i++) {
            if(!numCheck[i]){
                String str = numStr + strArr[i];
                numCheck[i] = true;
                primeCheck(str, size);
                numCheck[i] = false;
            }
        }
    }
}

//class Solution {
//    public int solution(String numbers) {
//        HashSet<Integer> set = new HashSet<>();
//        permutation("", numbers, set);
//        int count = 0;
//        while(set.iterator().hasNext()){
//            int a = set.iterator().next();
//            set.remove(a);
//            if(a==2) count++;
//            if(a%2!=0 && isPrime(a)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public boolean isPrime(int n){
//        if(n==0 || n==1) return false;
//        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
//            if(n%i==0) return false;
//        }
//        return true;
//    }
//
//    public void permutation(String prefix, String str, HashSet<Integer> set) {
//        int n = str.length();
//        //if (n == 0) System.out.println(prefix);
//        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
//        for (int i = 0; i < n; i++)
//            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
//
//    }
//}