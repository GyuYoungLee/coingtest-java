// 평균 구하기

package backjoon.P002_1546;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();

        int sum = 0, max = 0;

        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            sum += now;
            if (now > max) max = now;
        }

        double result = sum * 100.0 / max / N;
        System.out.println(result);
    }
}
