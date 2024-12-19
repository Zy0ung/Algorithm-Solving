import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine()); // 년도 입력 받기

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    System.out.println(1); // 4의 배수이면서 400의 배수일 때 윤년
                }
                else {
                    System.out.println(0); // 4의 배수이면서 100의 배수이고, 400의 배수가 아닐 때
                }
            } else { //  4의 배수 이면서 100의 배수가 아닐때 윤년
                System.out.println(1);
            }
        } else{
            System.out.println(0); // 4의 배수가 아닐 때
        }
    }
}