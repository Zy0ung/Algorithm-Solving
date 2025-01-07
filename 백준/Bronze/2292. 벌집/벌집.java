import java.io.*;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 층
        int layer = 1;
        // 층의 마지막 번호
        int last_num = 1;

        while (n > last_num) { // n이 층의 마지막 번호를 넘어갈때 까지 반복
            last_num += 6 * layer;
            layer++;
        }

        bw.write(layer + "");

        bw.flush();
        bw.close();
        br.close();
    }
}