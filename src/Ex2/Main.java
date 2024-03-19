package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n =0;
        int x =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        n = scanner.nextInt();
        System.out.println("Nhập x:");
        x = scanner.nextInt();

        // Tạo và khởi chạy các luồng
        Thread thread1 = new Thread(new F1(n));
        Thread thread2 = new Thread(new F2(n));
        Thread thread3 = new Thread(new F3(x, n));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Chờ các luồng hoàn thành
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Lấy kết quả từ các luồng
        long result1 = F1.getResult();
        long result2 = F2.getResult();
        long result3 = F3.getResult();

        // Tính tổng biểu thức
        long S = result1 + result2 + result3;
        System.out.println("S = " + S);
    }
}

