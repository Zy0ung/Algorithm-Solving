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

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int alarmH = 0;
        int alarmM = 0;

        if (M - 45 < 0) {
            if (H - 1 < 0) {
                alarmH = 23;
            } else {
                alarmH = H - 1;
            }
            alarmM = (M - 45) + 60;
        } else {
            alarmH = H;
            alarmM = M - 45;
        }
        System.out.println(alarmH + " " + alarmM);
    }
}