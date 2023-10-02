

public class In20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("20 số nguyên tố đầu tiên là:");
        for (int i = 2; i <= 1000; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
                count++;
                if (count == 20) {
                    break;
                }
            }
        }
    }
}