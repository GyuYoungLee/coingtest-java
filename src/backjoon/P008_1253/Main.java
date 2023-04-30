// 좋은 수 구하기 (투포인터)

package backjoon.P008_1253;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] s) {
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        Arrays.sort(A);
        int cnt = 0;

        for (int k = 0; k < N; k++) {
            int target = A[k];
            int i = 0;
            int j = N - 1;

            // 투 포인터
            while (i < j) {
                if (A[i] + A[j] > target) {
                    j--;
                } else if (A[i] + A[j] < target) {
                    i++;
                } else {
                    if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    } else {
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}

/*
10
1 2 3 4 5 6 7 8 9 10
*/