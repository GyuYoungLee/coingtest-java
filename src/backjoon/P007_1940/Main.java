// 주몽의 명령 (투포인터)

package backjoon.P007_1940;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] s) {
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        Arrays.sort(A);

        int i = 0;
        int j = N - 1;
        int cnt = 0;

        // 투 포인터
        while (i < j) {
            if (A[i] + A[j] > M) {
                j--;
            } else if (A[i] + A[j] < M) {
                i++;
            } else {
                cnt++;

                j--;
                i++;
            }
        }

        System.out.println(cnt);
    }
}

/*
6
9
2 7 4 1 5 3
*/