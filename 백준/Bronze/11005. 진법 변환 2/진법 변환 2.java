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

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer N = Integer.valueOf(st.nextToken()); // 10진법 수 N
        Integer B = Integer.valueOf(st.nextToken()); // B진법

        String result = Integer.toString(N, B);

        System.out.println(result.toUpperCase());
    }
}