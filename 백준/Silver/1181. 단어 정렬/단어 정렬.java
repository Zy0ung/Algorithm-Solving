import java.io.*;
import java.util.*;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어 개수
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i] = st.nextToken();
        }

        Set<String> uniqueList = new HashSet<>(List.of(arr));
        List<String> words = new ArrayList<>(uniqueList);

        Collections.sort(words, (a, b) -> {
            int lengthCompare = Integer.compare(a.length(), b.length());
            if (lengthCompare != 0) {
                return lengthCompare; // 길이가 다르면 길이로 정렬
            } else {
                // 길이가 같으면 사전 순 정렬
                return a.compareTo(b);
            }
        });

        for (String word : words) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}