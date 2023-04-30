// 절대값 힙 구현하기 (우선순위큐)

package backjoon.P014_11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pqu = new PriorityQueue<>((a, b) -> {
            int a_abs = Math.abs(a);
            int b_abs = Math.abs(b);
            if (a_abs == b_abs) {
                return a > b ? 1 : -1;
            } else {
                return a_abs > b_abs ? 1 : -1;
            }
        });

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int op = Integer.parseInt(br.readLine());

            if (op == 0) {
                // 꺼내기
                if (!pqu.isEmpty()) {
                    sb.append(pqu.peek()).append("\n");
                    pqu.poll();
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                // 넣기
                pqu.add(op);
            }
        }

        System.out.println(sb);
    }
}

/*
18
1
-1
0
0
0
1
1
-1
-1
2
-2
0
0
0
0
0
0
0
*/