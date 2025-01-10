import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int pNum = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        List<Integer> sNum = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            sNum.add(Integer.valueOf(st1.nextToken()));
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        // 티셔츠 T장이 1묶음
        int T = Integer.parseInt(st2.nextToken());
        // 펜 P개가 1묶음
        int P = Integer.parseInt(st2.nextToken());

        int tBundle = 0;
        for (int t = 0; t < sNum.size(); t++) {
            if (sNum.get(t) % T != 0) {
                tBundle += (sNum.get(t) / T) + 1;
            } else {
                tBundle += sNum.get(t) / T;
            }
        }

        int pBundle = pNum / P;
        int pResult = pNum % P;

        bw.write(tBundle + "\n");
        bw.write(pBundle + " " + pResult);

        bw.flush();
        bw.close();
        br.close();
    }
}