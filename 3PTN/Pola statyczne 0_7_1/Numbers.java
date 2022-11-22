public class Numbers {
    private Numbers l1;
    public Numbers getL1() {
        return l1;
    }
    public void setL1(Numbers l1) {
        this.l1 = l1;
    }

    private Numbers l2;
    public Numbers getL2() {
        return l2;
    }
    public void setL2(Numbers l2) {
        this.l2 = l2;
    }

    public Numbers(Numbers l1, Numbers l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    static void showMultiply(Numbers l1, Numbers l2) {
        int sum = 
        System.out.println(l1 * l2);
    }

    public static void main(String[] args) {
        showMultiply();
    }
}
