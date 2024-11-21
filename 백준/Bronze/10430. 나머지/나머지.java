import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());
        int C = Integer.parseInt(tokenizer.nextToken());

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}