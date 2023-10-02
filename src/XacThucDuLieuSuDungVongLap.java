

import java.util.Scanner;

public class XacThucDuLieuSuDungVongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào cạnh a :");
            int a = sc.nextInt();
            System.out.println("Nhập vào cạnh b :");
            int b = sc.nextInt();
            System.out.println("Nhập vào cạnh c :");
            int c = sc.nextInt();
            if (a + b < c || a + c < b || b + c < a || a < 0 || b < 0 || c < 0) {
                System.out.println("Đây không phải là hình tam giác, xin hãy nhập lại");
            } else {
                System.out.println("Đây là hình tam giác");
                System.out.println("Chu vi của hình tam giác là " + (a + b + c));
                double p = (double) (a + b + c) / 2;
                double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Diện tích của hình tam giác là " + S);
                break;
            }
        }
    }
}