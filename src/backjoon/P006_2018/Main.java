// 연속된 자연수의 합 구하기 (투포인터)

package backjoon.P006_2018;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();

        int i = 1;
        int j = 1;
        int sum = 1;
        int cnt = 0;

        while (j <= N) {
            if (sum < N) {
                j++;
                sum += j;
            } else if (sum > N) {
                sum -= i;
                i++;
            } else {
                cnt++;

                j++;
                sum += j;
                sum -= i;
                i++;
            }
        }

        System.out.println(cnt);
    }
}

/*
15
*/