import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[3];

            arr[0] = Integer.valueOf(st.nextToken());
            arr[1] = Integer.valueOf(st.nextToken());
            arr[2] = Integer.valueOf(st.nextToken());

            Arrays.sort(arr);

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == arr[2] * arr[2]) {
                list.add("right");
            } else {
                list.add("wrong");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}