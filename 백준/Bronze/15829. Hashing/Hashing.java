import static java.lang.Math.pow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int r = 31;

        int result = 0;

        for (int i = 0; i < L; i++) {
            result += (s.charAt(i) - 'a' + 1) * pow(r, i);

            result = result % 1234567891;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}