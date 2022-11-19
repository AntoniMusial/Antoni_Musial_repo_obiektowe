public class Numbers {
    private static int l1 = 2;

    public static int getL1() {
        return l1;
    }

    public static void setL1(int l1) {
        Numbers.l1 = l1;
    }


    private static int l2;

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        Numbers.l2 = l2;
    }

    static void showMultiply(l1, l2) {
        System.out.println(l1 * l2);
    }

    public static void main(String[] args) {
        showMultiply();
    }
}
