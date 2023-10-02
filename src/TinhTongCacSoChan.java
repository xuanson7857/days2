

import java.util.Scanner;

public class TinhTongCacSoChan {
    public static void main(String[] args) {
        int a, b, total;
        total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu :");
        a = sc.nextInt();
        System.out.println("Nhập số kết thúc :");
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + a + " đến " + b + " là : " + total);
    }
}