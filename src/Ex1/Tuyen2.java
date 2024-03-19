package Ex1;

public class Tuyen2 extends Thread {
    private Tuyen1 tuyen1;
    private double dienTich;

    public Tuyen2(Tuyen1 tuyen1) {
        this.tuyen1 = tuyen1;
    }

    public void run() {
        double chieuDai = tuyen1.getChieuDai();
        double chieuRong = tuyen1.getChieuRong();
        dienTich = chieuDai * chieuRong;
    }

    public double getDienTich() {
        return dienTich;
    }
}
