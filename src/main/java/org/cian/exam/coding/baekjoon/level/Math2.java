package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Math2 {
    public static void baek2447() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Boolean[][] starArray = new Boolean[N][N];
        for (Boolean[] booleans : starArray) {
            Arrays.fill(booleans, Boolean.TRUE);
        }

        int exponent = 0;
        int n = 1;
        while(n != N) {
            n *= 3;
            exponent++;
        }

        for(int i = 0 ; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                for(int k = 1 ; k <= exponent ; k++) {
                    if (!starArray[i][j]) {
                        continue;
                    }
                    for(int l = 0 ; l < Math.pow(3, exponent - k) ; l++) {
                        if (!starArray[i][j]) {
                            continue;
                        }

                        double left_l = (l * Math.pow(3, k)) + Math.pow(3, k-1) - 1;
                        double right_l = (l+1) * Math.pow(3, k) - Math.pow(3, k-1) - 1;

                        if(i <= left_l || i > right_l){
                            continue;
                        }

                        Boolean blankA = true;
                        if(i > left_l && i <= right_l) {
                            blankA = false;
                        }


                        for(int m = 0 ; m < Math.pow(3, exponent - k) ; m++) {
                            double left_m = (m * Math.pow(3, k)) + Math.pow(3, k-1) - 1;
                            double right_m = (m+1) * Math.pow(3, k) - Math.pow(3, k-1) - 1;
                            if(j <= left_m || j > right_m){
                                continue;
                            }

                            Boolean blankB = true;

                            if (j > left_m && j <= right_m) {
                                blankB = false;
                            }

                            if (!blankA && !blankB) {
                                starArray[i][j] = false;
                            }
                        }
                    }
                }
            }
        }

        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++) {
                if(starArray[i][j]) {
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void baek1002() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String[] strArray = br.readLine().split(" ");
            int x1 = Integer.parseInt(strArray[0]);
            int y1 = Integer.parseInt(strArray[1]);
            int r1 = Integer.parseInt(strArray[2]);
            int x2 = Integer.parseInt(strArray[3]);
            int y2 = Integer.parseInt(strArray[4]);
            int r2 = Integer.parseInt(strArray[5]);

            double distanceP = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }else if(x1 == x2 && y1 == y2 && r1 != r2) {
                System.out.println(0);
            }else if(distanceP < Math.pow(r1 - r2, 2)) {
                System.out.println(0);
            }else if(distanceP == Math.pow(r1 - r2, 2)) {
                System.out.println(1);
            }else if(distanceP == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            }else if(distanceP > Math.pow(r1 + r2, 2)) {
                System.out.println(0);
            }else {
                System.out.println(2);
            }
        }
    }

    public static void baek3053() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());

        System.out.println(String.format("%.6f", Math.PI * R * R));
        System.out.println(String.format("%.6f", (double) R * R * 2));
    }

    public static void baek4153() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] intArray = new int[3];

            for(int i = 0 ; i < 3 ; i++) {
                intArray[i] = Integer.parseInt(st.nextToken());
            }

            if(intArray[0] + intArray[1] + intArray[2] == 0) {
                break;
            }

            intArray = Arrays.stream(intArray).sorted().toArray();

            int wh = (intArray[0] * intArray[0]) + (intArray[1] * intArray[1]);
            int d = intArray[2] * intArray[2];

            if(wh == d) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }

    public static void baek3009() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArrayX = new int[3];
        int[] intArrayY = new int[3];

        for(int i = 0 ; i < intArrayX.length ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            intArrayX[i] = Integer.parseInt(st.nextToken());
            intArrayY[i] = Integer.parseInt(st.nextToken());
        }
        intArrayX = Arrays.stream(intArrayX).sorted().toArray();
        intArrayY = Arrays.stream(intArrayY).sorted().toArray();

        int x = intArrayX[0];
        int y = intArrayY[0];

        if(intArrayX[0] == intArrayX[1]) {
            x = intArrayX[2];
        }else if(intArrayX[0] == intArrayX[2]) {
            x = intArrayX[1];
        }
        if(intArrayY[0] == intArrayY[1]){
            y = intArrayY[2];
        }else if(intArrayY[0] == intArrayY[2]){
            y = intArrayY[1];
        }

        System.out.println(x + " " + y);
    }

    public static void baek1085() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] intArray = new int[4];

        for(int i = 0 ; i < intArray.length ; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());

            if(i == 2 || i == 3) {
                intArray[i] -= intArray[i - 2];
            }
        }

        intArray = Arrays.stream(intArray).sorted().toArray();

        System.out.println(intArray[0]);

    }

    public static void baek9020() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int n = Integer.parseInt(br.readLine());
            int A = n;
            int B = 0;

            Boolean[] prime = new Boolean[n + 1];
            Arrays.fill(prime, Boolean.FALSE);

            prime[0] = prime[1] = true;

            for(int j = 2 ; j < Math.sqrt(prime.length) ; j++){
                if(prime[j]){
                    continue;
                }
                for(int k = j * j ; k < prime.length ; k = k + j ) {
                    prime[k] = true;
                }
            }

            for(int j = 1 ; j <= n / 2 ; j++) {
                if(prime[j]) {
                    continue;
                }
                if(prime[n - j]) {
                    continue;
                }
                A = j;
                B = n - j;

            }
            System.out.println(A + " " + B);
        }
    }

    public static void baek4948() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = -1;
        while(n != 0){
            int cnt = 0;
            n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            Boolean[] prime = new Boolean[2 * n + 1];
            Arrays.fill(prime, Boolean.FALSE);

            prime[0] = prime[1] = true;

            for(int i = 2 ; i < Math.sqrt(prime.length) ; i++) {
                if(prime[i]){
                    continue;
                }

                for(int j = i * i ; j < prime.length ; j = j + i) {
                    prime[j] = true;
                }
            }

            for(int i = n + 1 ; i < prime.length ; i++){
                if(!prime[i]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static void baek1929() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] strArray = br.readLine().split(" ");
        int M = Integer.parseInt(strArray[0]);
        int N = Integer.parseInt(strArray[1]);
        StringBuffer sb = new StringBuffer();

        Boolean[] prime = new Boolean[N+1];
        Arrays.fill(prime, Boolean.FALSE);

        if(N > 1){
            prime[0] = prime[1] = true;

            for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++) {
                if(prime[i]) {
                    continue;
                }
                for(int j = i * i ; j < prime.length ; j = j + i) {
                    prime[j] = true;
                }
            }

            for(int i = M ; i < prime.length ; i++) {
                if(!prime[i]) {
                    sb.append(i).append("\n");
                }
            }
            System.out.println(sb);
        }
    }

    public static void baek11653() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int q = N;

        for(int i = 2 ; i <= N ; i++) {
            while(q % i == 0){
                q = q / i;
                System.out.println(i);
            }
            if(q == 1) {
                break;
            }
        }
    }

    public static void baek2581() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = -1;
        int sum = 0;
        if(M == 1) {
            M = 2;
        }

        for(int i = N ; i >= M ; i--) {

            int cnt = 0;
            for(int j = 2 ; j <= i / 2 ; j++) {
                if(i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0){
                min = i;
                sum += i;
            }

        }
        if(sum > 0){
            System.out.println(sum);
        }
        System.out.print(min);
    }


    public static void baek1978() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        java.lang.String[] strArray = br.readLine().split(" ");
        List<Integer> intList = new ArrayList<>();
        int result = 0;

        for(int i = 0 ; i < N ; i++) {
            intList.add(Integer.parseInt(strArray[i]));
        }
        intList = intList.stream().sorted().collect(Collectors.toList());

        for(int i = 0 ; i < intList.size() ; i++) {
            int cnt = 1;
            if(intList.get(i) == 1) {
                continue;
            }else if(intList.get(i) == 2 || intList.get(i) == 3) {
                result++;
                continue;
            }

            for(int j = 2 ; j <= intList.get(i) / 2 ; j++) {
                if(intList.get(i) % j == 0) {
                    cnt = 0;
                    break;
                }
            }
            if(cnt == 1) {
                result++;
            }
        }

        System.out.println("result = " + result);
    }
}
