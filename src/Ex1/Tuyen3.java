package Ex1;

public class Tuyen3 extends Thread {
    private Tuyen1 tuyen1;
    private double chuVi;

    public Tuyen3(Tuyen1 tuyen1) {
        this.tuyen1 = tuyen1;
    }

    public void run() {
        double chieuDai = tuyen1.getChieuDai();
        double chieuRong = tuyen1.getChieuRong();
        chuVi = 2 * (chieuDai + chieuRong);
    }

    public double getChuVi() {
        return chuVi;
    }
}
