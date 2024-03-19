package Ex1;

import java.util.Scanner;

// Class Tuyen1 để nhập hai cạnh của hình chữ nhật
public class Tuyen1 extends Thread {
    private double chieuDai;
    private double chieuRong;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật:");
        chieuDai = scanner.nextDouble();
        System.out.println("Nhập chiều rộng của hình chữ nhật:");
        chieuRong = scanner.nextDouble();
        scanner.close();
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }
}
