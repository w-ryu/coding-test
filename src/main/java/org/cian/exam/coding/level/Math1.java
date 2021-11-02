package org.cian.exam.coding.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Math1 {
    public static void back1011() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            java.lang.String[] strArray = br.readLine().split(" ");
            int x = Integer.parseInt(strArray[0]);
            int y = Integer.parseInt(strArray[1]);
            int length = y-x;

            double size = Math.round(Math.sqrt(length));
            int num = 0;


            if((size * size) - size < length && size * size >= length ) {
                num = (int)size * 2 - 1;
            }else if(size * size < length &&  (size * size) + size >= length) {
                num = (int)size * 2;
            }
            System.out.println(num);
        }
    }

    public static void back10757() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] arrayStr = br.readLine().split(" ");
        char[] charArrayA = arrayStr[0].toCharArray();
        char[] charArrayB = arrayStr[1].toCharArray();
        int arraySize = charArrayA.length + 1;
        if(charArrayA.length < charArrayB.length) {
            arraySize = charArrayB.length + 1;
        }

        int[] arrayInt = new int[arraySize];

        int up = 0;

        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < arraySize ; i++) {
            int A = 0;
            int B = 0;
            int sum = up;

            if(charArrayA.length > i){
                A = charArrayA[charArrayA.length - 1 - i] - 48;
            }
            if(charArrayB.length > i) {
                B = charArrayB[charArrayB.length - 1 - i] - 48;
            }

            sum += A + B;

            if(A + B == 0 && sum == 1){
                arrayInt[arraySize -1 - i] = sum;
                up = 0;
            }else if(sum >= 10) {
                up = 1;
                arrayInt[arraySize -1 - i] = sum % 10;
            }else {
                up = 0;
                arrayInt[arraySize -1 - i] = sum;
            }

            sum = 0;
        }
        for (int i = 0 ; i < arrayInt.length ; i++) {
            if(i == 0){
                if(arrayInt[0] == 0){
                    continue;
                }
            }
            sb.append(arrayInt[i]);

        }
        System.out.println(sb);

    }

    public static void back2839() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int big = N / 5;
        int small = N / 3;
        int cnt = 0;
        if(N % 5 == 0) {
            System.out.println(big);
        }else {
            for(int i = 1 ; i <= small ; i++) {
                if(cnt > 0) {
                    break;
                }
                for(int j = 0 ; j <= big ; j++) {
                    int num = (3 * i) + (5 * j);
                    if(N == num) {
                        cnt++;
                        System.out.println(i + j);
                        break;
                    }else if(N < num) {
                        break;
                    }
                }
            }
            if(cnt == 0) {
                System.out.println(-1);
            }
        }
    }

    public static void back2775() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int floor = Integer.parseInt(br.readLine());
            int num = Integer.parseInt(br.readLine());
            int[][] pArray = new int[floor+1][num];

            for(int j = 0 ; j < num ; j++) {
                for(int k = 0 ; k <= floor ; k++) {
                    if (j == 0) {
                        pArray[k][j] = 1;
                    }else if(k == 0) {
                        pArray[k][j] = j + 1;
                    }else {
                        pArray[k][j] = pArray[k-1][j] + pArray[k][j-1];
                    }
                }
            }
            System.out.println(pArray[floor][num-1]);

        }
    }

    public static void back10250() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0 ; t < T ; t++) {
            java.lang.String[] strArray = br.readLine().split(" ");
            int H = Integer.parseInt(strArray[0]);
            int W = Integer.parseInt(strArray[1]);
            int N = Integer.parseInt(strArray[2]);
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < W ; i++) {
                int left = H * i;
                int right = H * (i + 1);
                if(left < N && right >= N) {
                    int floor = N - left;
                    int room = i + 1;

                    if(room < 10) {
                        sb.append(floor)
                                .append("0")
                                .append(room);
                    }else {
                        sb.append(floor)
                                .append(room);
                    }
                    break;
                }
            }
            System.out.println(sb);
        }
    }

    public static void back2869() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] strArray = br.readLine().split(" ");
        int A = Integer.parseInt(strArray[0]);
        int B = Integer.parseInt(strArray[1]);
        int V = Integer.parseInt(strArray[2]);
        int num = (V - A) / (A - B) - 1;
        while(num < V) {
            int left = (A - B) * num + A;
            int right = (A - B) * (num + 1) + A;
            if(left < V && right >= V) {
                System.out.println(num + 2);
                break;
            }
            num++;
        }
    }

    public static void back1193() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int A = 0;
        while(A < X) {
            int left = (A * (A + 1)) / 2;
            int right = (A + 1) * (A + 2) / 2;
            if(left < X && right >= X) {
                int num = X - left;
                int row = A + 1;
                if(row % 2 == 0) {
                    System.out.println(num + "/" + (row + 1 - num) );
                }else {
                    System.out.println((row + 1 - num) + "/" + num);
                }

                break;
            }
            A++;
        }
    }

    public static void back2292() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = 0;
        int result = 0;
        if(N == 1) {
            result = 1;
        }else {
            while(A < N) {
                int B = (3 * A * (A + 1)) + 1;
                int C = (3 * (A + 1) * (A + 2)) + 1;
                if(B < N && N <= C) {
                    result = A + 2;
                    break;
                }
                A++;
            }
        }
        System.out.println(result);
    }

    public static void back1712() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        if(C-B <= 0) {
            System.out.println(-1);
        }else {
            System.out.println(A / (C-B) + 1);
        }
    }
}
