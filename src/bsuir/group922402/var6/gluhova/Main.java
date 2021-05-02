package bsuir.group922402.var6.gluhova;

public class Main {

    private static Calc staticCalc = new Calc(); // Статическая ссылка staticCalc
    static {
        staticCalc.set(10, 5, 3);
    }

    public static void main(String args[]) {
        staticCalc.run();
        System.out.println("staticCalc result");
        staticCalc.print();
    }
}