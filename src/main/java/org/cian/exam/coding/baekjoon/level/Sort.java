package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sort {

    public void baek18870()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int[] originIntArr = new int[N];
        int[] orderIntArr = new int[N];

        Map changeMap = new HashMap();
        for(int i = 0 ; i < N ; i++) {
            originIntArr[i] = orderIntArr[i] = Integer.parseInt(strArr[i]);
        }

        orderIntArr = Arrays.stream(orderIntArr).sorted().distinct().toArray();

        int index = 0;

        for(int v : orderIntArr) {
            changeMap.put(v, index);
            index++;
        }

        StringBuilder sb = new StringBuilder();

        for(int key : originIntArr) {
            sb.append(changeMap.get(key) + " ");
        }
        System.out.println(sb);
    }

    public void baek10814()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] memberArr = new String[N][2];

        for(int i = 0 ; i < N ; i++) {
            String[] strArr = br.readLine().split(" ");
            memberArr[i][0] = strArr[0];
            memberArr[i][1] = strArr[1];
        }

        Arrays.sort(memberArr, (member1, member2) -> {
            return Integer.parseInt(member1[0]) - Integer.parseInt(member2[0]);
        });

        StringBuilder sb = new StringBuilder();
        for(String[] member : memberArr) {
            sb.append(member[0] + " " + member[1]).append("\n");
        }

        System.out.println(sb);
    }

    // 문자 정렬 [중복 제거]
    public void baek1181()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strArr = new String[N];
        for(int i = 0 ; i < N ; i++) {
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr, (str1, str2) -> {
            if(str1.length() == str2.length()) {
                return str1.compareTo(str2);
            }else {
                return str1.length() - str2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]).append("\n");

        for(int i = 1 ; i < N ; i++) {
            if(!strArr[i].equals(strArr[i-1])){
                sb.append(strArr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }

    // 이차배열 정렬
    public void baek11651()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] xyArr = new int[N][2];


        for(int i = 0 ; i < N ; i++) {
            String[] strArr = br.readLine().split(" ");
            xyArr[i][1] = Integer.parseInt(strArr[0]);
            xyArr[i][0] = Integer.parseInt(strArr[1]);
        }

        Arrays.sort(xyArr, (xy1, xy2) -> {
            if(xy1[0] == xy2[0]) {
                return Integer.compare(xy1[1], xy2[1]);
            }else {
                return Integer.compare(xy1[0], xy2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int[] xy : xyArr) {
            sb.append(xy[1] + " " + xy[0]).append("\n");
        }
        System.out.println(sb);
    }

    // 이차배열 정렬
    public void baek11650()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] intArr = new int[N][2];

        for(int i = 0 ; i < N ; i++) {
            String[] strArr = br.readLine().split(" ");
            intArr[i][0] = Integer.parseInt(strArr[0]);
            intArr[i][1] = Integer.parseInt(strArr[1]);
        }

        Arrays.sort(intArr, (xy1, xy2) -> {
            if(xy1[0] == xy2[0]) {
                return Integer.compare(xy1[1], xy2[1]);
            }else {
                return Integer.compare(xy1[0], xy2[0]);
            }
        });

        StringBuffer sb = new StringBuffer();
        for(int[] a : intArr) {
            sb.append(a[0] + " " + a[1]).append("\n");
        }
        System.out.println(sb);
    }


    static int[] intArr;
    static int count;
    public void baek1427()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        intArr = new int[10];
        count = 0;
        numSplit(N);
        Integer[] resultArr = new Integer[count + 1];

        for(int i = 0 ; i <= count ; i++) {
            resultArr[i] = intArr[i];
        }

        Arrays.sort(resultArr, Collections.reverseOrder());

        for(int a : resultArr){
            System.out.print(a);
        }
    }

    static void numSplit(int N) {

        if(N < 10) {
            intArr[count] = N;
            return;
        }

        intArr[count] = N % 10;
        N /= 10;
        count++;
        numSplit(N);
    }

    public void baek2108()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arrayN = new int[N];
        int[] arrayMode = new int[8001];
        double sum = 0;
        int mode = -4001;
        int modeIndex = -4001;
        int secondModeIndex = -4001;

        for(int i = 0 ; i < N ; i++) {
            arrayN[i] = Integer.parseInt(br.readLine());
            sum += arrayN[i];
            arrayMode[arrayN[i] + 4000]++;
        }

        Arrays.sort(arrayN);

        for(int i = arrayN[0] + 4000 ; i <= arrayN[N-1] + 4000 ; i++){
            if (mode == arrayMode[i] && secondModeIndex == -4001) {
                secondModeIndex = i - 4000;
            }
            if(mode < arrayMode[i]) {
                mode = arrayMode[i];
                modeIndex = i - 4000;
                secondModeIndex = -4001;
            }
        }
        if(secondModeIndex == -4001) {
            secondModeIndex = modeIndex;
        }

        int average = (int)Math.round(sum / N);
        int mid = arrayN[N/2];
        int scope = arrayN[N-1] - arrayN[0];

        System.out.println(average);
        System.out.println(mid);
        System.out.println(secondModeIndex);
        System.out.println(scope);
    }

    public void baek10989()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] intArray = new int[N];

        for(int i = 0 ; i < N ; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArray);
        StringBuffer sb = new StringBuffer();
        for (int num : intArray) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }

    public void baek2751()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> intList = new ArrayList();

        for(int i = 0 ; i < N ; i++) {
            intList.add(Integer.parseInt(br.readLine()));
        }

        intList = intList.stream().distinct().sorted().collect(Collectors.toList());

        StringBuffer sb = new StringBuffer();
        for (int num : intList) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
