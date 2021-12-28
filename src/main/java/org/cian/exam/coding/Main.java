package org.cian.exam.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arrayN = new int[N];
        int sum = 0;
        int mid = 0;
        int mode = 0;
        int scope = 0;
        for(int i = 0 ; i < N ; i++) {
            arrayN[i] = Integer.parseInt(br.readLine());
            sum += arrayN[i];
        }

        Arrays.sort(arrayN);

        int[] arrayMode = new int[arrayN[N-1]+1];

        for(int i = 0 ; i < N ; i++) {
            arrayMode[arrayN[i]]++;
        }

        mid = arrayN[N/2 + 1];
        System.out.println(Math.round(sum / N));
        System.out.println(mid);
        System.out.println(mode);

    }
}
