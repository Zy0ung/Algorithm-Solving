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

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeatCount = Integer.parseInt(st.nextToken());

            String P = "";

            String S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {
                String s = String.valueOf(S.charAt(j));
                P += s.repeat(repeatCount);
            }
            System.out.println(P);
        }
    }
}