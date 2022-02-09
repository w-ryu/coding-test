package org.cian.exam.coding.baekjoon.level.if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * [if문 단계] 완 / 브론즈3 / 16112KB / 152ms / 641B
 * 기존 소스에서는 Scanner를 사용하였는데, 현재는 BufferedReader사용
 * 각 row에 System.out.print 보다는 마지막 한번 호출이 더 효율적임
 */
public class Baek2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int H = Integer.parseInt(inputArr[0]);
        int M = Integer.parseInt(inputArr[1]);
        if(H == 0 && M < 45) {
            H = 23;
            M += 15;
        }else if(M < 45) {
            H--;
            M += 15;
        }else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }

    /**
     * 18472KB / 232ms / 551B
     * 4달 전 소스
     */
    void before() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M-45 >= 0) {
            System.out.println(H + " " + (M-45));
        }else {
            if(H == 0) {
                System.out.println(23 + " " + (M+15));
            }else {
                System.out.println((H-1) + " " + (M+15));
            }
        }

        scanner.close();
    }
}
