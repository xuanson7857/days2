
import java.util.Scanner;

public class TimSoChiaHetNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1;
        while (true) {
            if (N % 5 == 0 && N % 7 == 0 && N % 11 == 0) {
                System.out.println("Số nhỏ nhất chia hết cho 5,7,11 là " + N);
                break;
            }
            N++;
        }
    }
}