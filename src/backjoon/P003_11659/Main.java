// 구간 합 구하기 (구간합)

package backjoon.P003_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[] S = new int[N + 1];

        // 합배열 생성
        stk = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int now = Integer.parseInt(stk.nextToken());
            S[i] = S[i - 1] + now;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(stk.nextToken());
            int en = Integer.parseInt(stk.nextToken());
            sb.append(S[en] - S[st - 1]).append("\n");
        }
        System.out.println(sb);
    }
}

/*
5 3
5 4 3 2 1
1 3
2 4
5 5
*/