// 구간 합 구하기 2 (구간합)

package backjoon.P004_11660;

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

        int[][] S = new int[N + 1][N + 1];

        // 합배열 생성
        for (int i = 1; i <= N; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int now = Integer.parseInt(stk.nextToken());
                S[i][j] = S[i - 1][j] + S[i][j - 1] - S[i - 1][j - 1] + now;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(br.readLine());
            int X1 = Integer.parseInt(stk.nextToken());
            int Y1 = Integer.parseInt(stk.nextToken());
            int X2 = Integer.parseInt(stk.nextToken());
            int Y2 = Integer.parseInt(stk.nextToken());
            int r = S[X2][Y2] - S[X2][Y1 - 1] - S[X1 - 1][Y2] + S[X1 - 1][Y1 - 1];
            sb.append(r).append('\n');
        }
        System.out.println(sb);
    }
}

/*
4 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4
*/