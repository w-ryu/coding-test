package org.cian.exam.coding.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2 {

    //유기농 배추 [미완]
    static boolean[][] filed;
    public static void baek1012() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int test = 0 ; test < t ; test++){
            int answer = 0;
            String[] strArr = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            int k = Integer.parseInt(strArr[2]);

            filed = new boolean[n][m];
            for(int i = 0 ; i < k ; i++) {
                String[] xyArr = br.readLine().split(" ");
                filed[Integer.parseInt(xyArr[0])][Integer.parseInt(xyArr[1])] = true;
            }

            for(int i = 0 ; i < n ; i++) {
                for(int j = 0 ; j < m ; j++) {
                    if(filed[i][j]){
                        group(i, j, n, m);
                        answer++;
                    }
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    static void group(int x, int y, int n, int m) {
        if(filed[x][y]) filed[x][y] = false;
        if(x < n-1 && filed[x+1][y]) group(x+1, y, n, m);
        if(x-1 >= 0 && filed[x-1][y]) group(x-1, y, n, m);
        if(y < m-1 && filed[x][y+1]) group(x, y+1, n, m);
        if(y-1 >= m && filed[x][y-1]) group(x, y-1, n, m);
    }
}
