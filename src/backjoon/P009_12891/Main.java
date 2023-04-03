// DNA 비밀번호 (슬라이딩 윈도우)

package backjoon.P009_12891;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] check = new int[4];
    static int checkCnt = 0;

    public static void main(String[] args) {
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] A = sc.next().toCharArray();
        for (int i = 0; i < 4; i++) {
            check[i] = sc.nextInt();
            if (check[i] == 0) checkCnt++;
        }

        int cnt = 0;

        // 첫 윈도우 체크
        for (int i = 0; i < P; i++) addCh(A[i]);
        if (checkCnt == 4) cnt++;

        // 슬라이딩하면서 각 윈도우 체크
        for (int i = P; i < S; i++) {
            addCh(A[i]);
            removeCh(A[i - P]);
            if (checkCnt == 4) cnt++;
        }

        System.out.println(cnt);
    }

    private static void addCh(char c) {
        // Java 14
        switch (c) {
            case 'A' -> {
                check[0]--;
                if (check[0] == 0) checkCnt++;
            }
            case 'C' -> {
                check[1]--;
                if (check[1] == 0) checkCnt++;
            }
            case 'G' -> {
                check[2]--;
                if (check[2] == 0) checkCnt++;
            }
            case 'T' -> {
                check[3]--;
                if (check[3] == 0) checkCnt++;
            }
        }
    }

    private static void removeCh(char c) {
        switch (c) {
            case 'A' -> {
                if (check[0] == 0) checkCnt--;
                check[0]++;
            }
            case 'C' -> {
                if (check[1] == 0) checkCnt--;
                check[1]++;
            }
            case 'G' -> {
                if (check[2] == 0) checkCnt--;
                check[2]++;
            }
            case 'T' -> {
                if (check[3] == 0) checkCnt--;
                check[3]++;
            }
        }
    }
}
