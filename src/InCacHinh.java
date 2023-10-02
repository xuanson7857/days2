

import java.util.Scanner;

public class InCacHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông");
        System.out.println("3. In hình tam giác cân");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int width, height;
                System.out.println("Nhập1 giá trị cạnh width :");
                width = sc.nextInt();
                System.out.println("Nhập giá trị cạnh height :");
                height = sc.nextInt();
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= height; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int row = 6;
                System.out.println("Vui lòng chọn hình tam giác vuông để in");
                System.out.println("1. Tam giác vuông dưới bên trái");
                System.out.println("2. Tam giác vuông dưới bên phải");
                System.out.println("3. Tam giác vuông trên bên trái");
                System.out.println("4. Tam giác vuông trên bên phải");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        for (int i = 1; i <= row; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:

                        for (int i = 1; i <= row; i++) {
                            for (int j = row; j >= i; j--) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <=i ; k++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        for (int i = 1; i <= row; i++) {
                            for (int j = row; j >= i; j--) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        for (int i = 1; i <= row; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = i; j <= row; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                int rows = 5;
                for (int i = 1; i <= rows; i++) {
                    for (int j = i; j < rows; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                break;
        }
    }
}