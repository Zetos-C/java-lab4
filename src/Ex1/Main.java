package Ex1;

public class Main {
    public static void main(String[] args) {
        Tuyen1 tuyen1 = new Tuyen1();
        tuyen1.start();

        try {
            tuyen1.join(); // Chờ cho tuyến 1 hoàn thành
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Tuyen2 tuyen2 = new Tuyen2(tuyen1);
        tuyen2.start();

        Tuyen3 tuyen3 = new Tuyen3(tuyen1);
        tuyen3.start();

        try {
            tuyen2.join(); // Chờ cho tuyến 2 hoàn thành
            tuyen3.join(); // Chờ cho tuyến 3 hoàn thành
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Diện tích của hình chữ nhật là: " + tuyen2.getDienTich());
        System.out.println("Chu vi của hình chữ nhật là: " + tuyen3.getChuVi());
    }
}