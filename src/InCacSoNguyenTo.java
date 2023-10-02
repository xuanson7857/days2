

import java.util.Scanner;

public class InCacSoNguyenTo {
    public static void main(String[] args) {
        int num = 100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Các số nguyên tố nhỏ hơn 100 là :");
        for (int i = 2; i <= num; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " , ");
            }
        }
    }
}