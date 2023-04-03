// 합 구하기

package backjoon.P001_11720;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        char[] number = sc.next().toCharArray();

        int sum = 0;
        for (char n : number) {
            sum += n - '0';
        }

        System.out.println(sum);
    }
}
