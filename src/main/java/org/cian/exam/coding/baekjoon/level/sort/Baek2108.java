package org.cian.exam.coding.baekjoon.level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek2108 {
    public static void main(String[] args) throws IOException {
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
}
