import java.io.*;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 배달해야할 무게
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        while (n > 0) {
            // 5로 나누어 떨어진다면
            if (n % 5 == 0) {
                result += n / 5;
                break;
            } else { // 5로 나누어 떨어지지 않는다면 3kg 이거나 봉지에 나눠담지 못하는 것
                n -= 3;
                result++;
            }
            if (n < 0) {
                result = -1;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}