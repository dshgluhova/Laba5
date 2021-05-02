package bsuir.group922402.var6.gluhova;

public class Calc {
    private int x1;
    private int x2;
    private int y;
    private int b;

    public void set(int x1, int x2, int y) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
    }

    public void run() {
        b = (x1 + x2) * y;
    }
    public void print() {
        System.out.println("" + this + ": х1=" + x1 + ", x2=" + x2 + ", y=" + y);
        System.out.println("Result = " + b);
    }
}
