import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        // num 숫자가 몇번 나왔는지 누적하기
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] += 1;
        }

        // Arrays.sort(arr); -> Counting Sort에서는 시간초과

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                bw.write(i + "\n");
                arr[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}