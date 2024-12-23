import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (Integer.parseInt(br.readLine()) % 42);
        }

        int[] unique = Arrays.stream(arr).distinct().toArray();

        System.out.println(unique.length);
    }
}