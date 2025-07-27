import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 층
            int K = Integer.parseInt(br.readLine());
            // 호
            int N = Integer.parseInt(br.readLine());

            int[][] dp = new int[K + 1][N + 1];

            // 0층 초기화 : 0층 i호에는 i명이 산다.
            for (int j = 1; j <= N; j++) {
                dp[0][j] = j;
            }

            // 점화식
            for (int r = 1; r <= K; r++) {
                for (int c = 1; c <= N; c++) {
                    dp[r][c] = dp[r][c - 1] + dp[r - 1][c];
                }
            }
            bw.write(dp[K][N] + "\n");
        }

        bw.flush();
        bw.close();
    }
}