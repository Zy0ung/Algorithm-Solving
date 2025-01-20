import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer num = Integer.parseInt(br.readLine());

        Integer result = 0;

        for (int i = 1; i <= num; i++) {
            int sum = i;
            int temp = i;

            // 각 자릿수를 더한다.
            while (temp > 0) {
                // 숫자의 가장 오른쪽 자릿수를 얻을 수 있음.
                sum += temp % 10;
                // 숫자의 가장 오른쪽 자릿수를 없앨 수 있음.
                temp /= 10;
            }

            // 분해합값과 입력값이 같다면 생성자 발견
            if (sum == num) {
                result = i;
                break;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}