package org.cian.exam.coding.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math2 {
    public static void back9020() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int n = Integer.parseInt(br.readLine());


        }
    }

    public static void back4948() throws IOException {
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

    public static void back1929() throws IOException {
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

    public static void back11653() throws IOException {
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

    public static void back2581() throws IOException {
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


    public static void back1978() throws IOException {
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
