import java.io.*;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int result = 0;

        while (true) {
            if (String.valueOf(result).contains("666")) {
                count++;
            }
            if (count == n) {
                bw.write(String.valueOf(result));
                break;
            }
            result++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}