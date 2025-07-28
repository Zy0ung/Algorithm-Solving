import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();

            if (s.equals("0")) {
                break;
            }

            String str = new StringBuilder(s).reverse().toString();

            if (s.equals(str)) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}