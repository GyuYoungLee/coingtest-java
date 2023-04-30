// 스택으로 수열 만들기 (스택)

package backjoon.P011_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        int num = 1;

        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());

            while (num <= now) {
                sb.append("+\n");
                st.push(num++);
            }

            if (!st.isEmpty() && st.peek() == now) {
                sb.append("-\n");
                st.pop();
            } else {
                sb.delete(0, sb.length());
                sb.append("NO");
                break;
            }
        }

        System.out.println(sb);
    }
}

/*
8
4
3
6
8
7
5
2
1
*/