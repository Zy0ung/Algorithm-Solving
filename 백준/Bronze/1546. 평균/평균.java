import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] score = new double[num];

        for (int i = 0; i < num; i++) {
            score[i] = Double.valueOf(st.nextToken());
        }

        Arrays.sort(score);

        double result = 0;
        for (int i = 0; i < num; i++) {
            result += score[i] / score[score.length - 1] * 100;
        }

        bw.write(result / num + "");
        bw.flush();
        bw.close();
        br.close();
    }
}