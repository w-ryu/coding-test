package org.cian.exam.coding.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Str {
    public static void back1316() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0 ; i < N ; i++) {
            char[] charArray = br.readLine().toCharArray();
            if(charArray.length < 3){
                result ++;
                continue;
            }
            int outCnt = 0;
            for(int j = 0 ; j < charArray.length - 1 ; j++) {
                int cnt = 0;
                if(outCnt > 0) {
                    break;
                }
                for(int k = j+1 ; k < charArray.length ; k++) {
                    if(cnt == 0 && charArray[j] == charArray[k]) {
                        continue;
                    }else if(cnt > 0 && charArray[j] == charArray[k]) {
                        outCnt++;
                    }else {
                        cnt++;
                    }
                }
            }
            if(outCnt == 0) {
                result ++;
            }
        }
        System.out.println(result);
    }

    public static void back2941() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray1 = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String[] strArray2 = {"A", "B", "C", "D", "E", "F", "G", "H"};

        String S = br.readLine();
        for(int i = 0 ; i < strArray1.length ; i++) {
            S = S.replaceAll(strArray1[i], strArray2[i]);
        }

        System.out.println(S.toCharArray().length);
    }

    public static void back5622() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int result = 0;
        for (char c : charArray) {
            int num = (int)c - 65;
            if(num < 15) {
                result += (num / 3) + 3;
            }else if(num > 14 && num < 19) {
                result += 8;
            }else if(num > 18 && num < 22) {
                result += 9;
            }else {
                result += 10;
            }
        }
        System.out.println(result);
    }

    public static void back1152() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
    }

    public static void back1157() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputList = br.readLine().toUpperCase().toCharArray();
        int[] intList = new int[26];

        for(int i = 0 ; i < inputList.length ; i++) {
            intList[(inputList[i]-65)]++;
        }
        int max = Arrays.stream(intList).max().getAsInt();

        int cnt = 0;
        char index = 65;
        for (int j = 0 ; j < intList.length ; j++) {
            if(max == intList[j]){
                cnt++;
                index += j;
            }
        }

        if(cnt > 1) {
            System.out.println("?");
        }else {
            System.out.println(index);
        }
    }

    public static void back2675() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String[] strList = br.readLine().split(" ");
            StringBuffer sb = new StringBuffer();
            int R = Integer.parseInt(strList[0]);
            char[] SList = strList[1].toCharArray();


            for(int j = 0 ; j < SList.length ; j++) {
                for(int k = 0 ; k < R ; k++) {
                    sb.append(SList[j]);
                }
            }
            System.out.println(sb);
        }
    }

    public static void back10809() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputList = br.readLine().toCharArray();
        int[] resultList = new int[26];

        for (int i = 0 ; i < resultList.length ; i++) {
            resultList[i] = -1;
        }

        for(int j = inputList.length - 1 ; j >= 0 ; j-- ) {
            int num = (int)inputList[j] - 97;
            resultList[num] = j;
        }
        StringBuffer sb = new StringBuffer();
        for (int i : resultList) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }

    public static void back11720() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] inputList = br.readLine().toCharArray();
        int result = 0;
        for (char c : inputList) {
            int num = (int)c-48;
            result += num;
        }
        System.out.println(result);
    }

    public static void back11654() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char inputChar = br.readLine().charAt(0);
        int inputInt = (int)inputChar;

        System.out.println("inputInt = " + inputInt);
    }

    public static void back1065() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int result = 0;

        if(N < 100) {
            result = N;
        }else{
            for(int i = 100 ; i <= N ; i++) {
                int first = ((i % 1000) / 100) - ((i % 100) / 10);
                int second = ((i % 100) / 10) - (i % 10);

                if(first == second){
                    cnt ++;
                }
            }
            result = 99 + cnt;
        }

        if(N == 1000){result -= 1;}

        System.out.println("result = " + result);

    }
}
