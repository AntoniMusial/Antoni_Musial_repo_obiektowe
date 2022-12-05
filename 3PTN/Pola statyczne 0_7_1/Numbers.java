public class Numbers {
    private static int l1 = 2;
    private int l2;

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public Integer getL1() {
        return l1;
    }

    public Integer getL2() {
        return l2;
    }

    public Numbers() {
        l2 = 4;
    }

    public void showMiltiply() {
        System.out.println(l1 + " * " + l2 + " = " + (l1 * l2));
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.l2 = 4;
        numbers.showMiltiply();
        Numbers n1 = new Numbers();
        Numbers n2 = new Numbers();
        Numbers n3 = new Numbers();
        Numbers n4 = new Numbers();
        Numbers n5 = new Numbers();
        Numbers n6 = new Numbers();
        Numbers n7 = new Numbers();
        Numbers n8 = new Numbers();
        Numbers n9 = new Numbers();
        Numbers n10 = new Numbers();
        Numbers numbers1 = Numbers(1);

        System.out.println(numbers.l2);
        System.out.println(numbers.getL1());
    }
}