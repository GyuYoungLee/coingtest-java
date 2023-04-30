// 최솟값 찾기 (슬라이딩 윈도우)

package backjoon.P010_11003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int L = Integer.parseInt(stk.nextToken());

        Deque<Node> dq = new LinkedList<>();

        // 첫 윈도우 체크
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < L; i++) {
            int now = Integer.parseInt(stk.nextToken());

            while (!dq.isEmpty() && dq.getLast().value > now) dq.removeLast();
            dq.addLast(new Node(now, i));

            sb.append(dq.getFirst().value).append(" ");
        }

        // 슬라이딩하면서 각 윈도우 체크
        for (int i = L; i < N; i++) {
            int now = Integer.parseInt(stk.nextToken());

            // 뒤쪽에 새로운 값 추가
            while (!dq.isEmpty() && dq.getLast().value > now) dq.removeLast();
            dq.addLast(new Node(now, i));

            // 앞쪽에 기존 값 제거
            if (dq.getFirst().index <= i - L) dq.removeFirst();

            sb.append(dq.getFirst().value).append(" ");
        }

        System.out.println(sb);
    }

    static class Node {
        int value;
        int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}

/*
12 3
1 5 2 3 6 2 3 7 3 5 2 6
*/