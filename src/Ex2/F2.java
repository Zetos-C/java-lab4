package Ex2;

public class F2 implements Runnable {
    private static long result = 0;
    private int n;

    public F2(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            result += i;
        }
    }

    public static long getResult() {
        return result;
    }
}

