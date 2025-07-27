import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int r = 31;
        final int M = 1234567891;

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long result = 0;
        long rPow = 1;

        for (int i = 0; i < L; i++) {
            int charValue = s.charAt(i) - 'a' + 1;
            result = ((result + charValue * rPow) % M);
            rPow = (rPow * r) % M;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}