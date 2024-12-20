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
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }

        int max = Arrays.stream(arr).max().getAsInt();

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                index = i;
                break;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);
    }
}