package Ex2;

public class F3 implements Runnable {
    private static long result = 0;
    private int x;
    private int n;

    public F3(int x, int n) {
        this.x = x;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            result += Math.pow(x, i);
        }
    }

    public static long getResult() {
        return result;
    }
}
