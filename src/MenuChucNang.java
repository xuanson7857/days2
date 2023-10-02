

import java.util.Scanner;

public class MenuChucNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Chức Năng :");
        System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
        System.out.println("2. Kiểm tra số nguyên tố :");
        System.out.println("3. Kiểm tra số có chia hết cho 3 hay không :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập số cần kiểm tra tính chẵn lẻ :");
                int a = sc.nextInt();
                if (a % 2 == 0)
                    System.out.println("số " + a + " là số chẵn");
                else
                    System.out.println("số " + a + " là số lẻ");
                break;
            case 2:
                System.out.println("Nhập số cần kiểm tra số nguyên tố :");
                int b = sc.nextInt();
                boolean check = true;
                for (int i = 2; i < b / 2; i++) {
                    if (b % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check)
                    System.out.println("số " + b + " là số nguyên tố");
                else
                    System.out.println("số " + b + " không phải là số nguyên tố");
                break;
            case 3:
                System.out.println("Nhập số cần kiểm tra có chia hết cho 3 hay không :");
                int c = sc.nextInt();
                if (c % 3 == 0)
                    System.out.println("số " + c + " là số chia hết cho 3");
                else
                    System.out.println("số " + c + " là số không chia hết cho 3");
                break;
        }
    }
}