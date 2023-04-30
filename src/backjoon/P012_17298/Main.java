// 오큰수 구하기 (스택)

package backjoon.P012_17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        Stack<Node> st = new Stack<>();
        int[] result = new int[N];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(stk.nextToken());

            // now가 큰 수라면 오큰수로 저장
            while (!st.isEmpty() && st.peek().value < now) {
                int idx = st.peek().index;
                result[idx] = now;
                st.pop();
            }

            st.push(new Node(now, i));
        }

        while (!st.isEmpty()) {
            int idx = st.peek().index;
            result[idx] = -1;
            st.pop();
        }

        for (int x : result) sb.append(x).append(" ");
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
4
3 5 2 7
*/