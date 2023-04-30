// 카드 게임 (큐)

package backjoon.P013_2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> qu = new LinkedList<>();
        for (int i = 1; i <= N; i++) qu.add(i);

        while(qu.size() > 1) {
            qu.poll();
            qu.add(qu.peek());
            qu.poll();
        }

        System.out.println(qu.peek());
    }
}

/*
6
*/