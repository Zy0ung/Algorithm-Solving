import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer A = Integer.parseInt(st.nextToken());
        Integer B = Integer.parseInt(st.nextToken());

        if (A > B) {
            bw.write(">");
        } else if (A < B) {
            bw.write("<");
        } else {
            bw.write("==");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}