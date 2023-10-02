

import java.util.Scanner;

public class UngDungTinhChuVi_DienTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Chức Năng :");
        System.out.println("1. Tính chu vi và diện tích hình chữ nhật :");
        System.out.println("2. Tính chu vi và diện tích hình tam giác :");
        System.out.println("3. Tính chu vi và diện tích hình tròn :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập chiều dài cạnh a :");
                int a = sc.nextInt();
                System.out.println("Nhập chiều dài cạnh b :");
                int b = sc.nextInt();
                System.out.println("Chu vi của hình chữ nhật là : " + (2 * (a + b)));
                System.out.println("Diện tích hình chữ nhật là : " + (a * b));
                break;
            case 2:
                System.out.println("Nhập chiều dài cạnh 1 :");
                int c1 = sc.nextInt();
                System.out.println("Nhập chiều dài cạnh 2 :");
                int c2 = sc.nextInt();
                System.out.println("Nhập chiều dài cạnh 3 :");
                int c3 = sc.nextInt();
                System.out.println("Chu vi của hình tam giác là : " + (c1 + c2 + c3));
                double p = (double) (c1 + c2 + c3) / 2;
                double S = Math.sqrt(p * (p - c1) * (p - c2) * (p - c3));
                System.out.println("Diện tích của hình tam giác là : " + S);
                break;
            case 3:
                System.out.println("Nhập bán kính hình tròn :");
                int r = sc.nextInt();
                final double PI = 3.14;
                double C = 2 * r * PI;
                double s = PI * r;
                System.out.println("Chu vi hình tròn là " + C);
                System.out.println("Diện tích hình tròn là " + s);
        }
    }
}