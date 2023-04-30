// 나머지 합 구하기 (구간합)

package backjoon.P005_10986;

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

        long[] S = new long[N + 1];
        long[] C = new long[M];

        // 합배열 생성
        stk = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int now = Integer.parseInt(stk.nextToken());
            S[i] = S[i - 1] + now;
        }

        // 변형된 합배열 생성
        for (int i = 0; i <= N; i++) {
            int remain = (int) (S[i] % M);
            C[remain]++;
        }

        // 계산
        long cnt = 0;
        for (int i = 0; i < M; i++) {
            cnt += C[i] * (C[i] - 1) / 2;
        }
        System.out.println(cnt);
    }
}

/*
5 3
1 2 3 1 2
*/