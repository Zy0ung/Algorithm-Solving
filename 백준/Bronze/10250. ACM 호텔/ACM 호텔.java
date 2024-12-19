import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 개수
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 층수
            int W = Integer.parseInt(st.nextToken()); // 객실 수
            int N = Integer.parseInt(st.nextToken()); // n번째 손님
            int room_num = 1;

            // 2차원 배열 개념
            int arr[][] = new int[H][W];

            // 방 번호 부여
            for (int j = 0; j < H; j++) {
                room_num += (100 * (j + 1));

                for (int k = 0; k < W; k++) {
                    arr[j][k] = room_num++;
                }
                room_num = 1;
            }


            int count = 0;

            for (int j = 0; j < W; j++) {
                for (int k = 0; k < H; k++) {
                    count++;
                    if (count == N) {
                        System.out.println(arr[k][j]);
                        break;
                    }
                }
            }
        }
    }
}