public class Numbers {
    //ZMIENNE - poczatek
    private static int l1 = 2;
    private int l2;
    int n1 = 1;
    int n2 = 2;
    int n3 = 3;
    int n4 = 4;
    int n5 = 5;
    int n6 = 6;
    int n7 = 7;
    int n8 = 8;
    int n9 = 9;
    int n10 = 10;
    //ZMIENNE - koniec

    //SETTERY - poczatek
    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }

    public void setN6(int n6) {
        this.n6 = n6;
    }

    public void setN7(int n7) {
        this.n7 = n7;
    }

    public void setN8(int n8) {
        this.n8 = n8;
    }

    public void setN9(int n9) {
        this.n9 = n9;
    }

    public void setN10(int n10) {
        this.n10 = n10;
    }
    
    public void setL1(int l1) {
        this.l1 = l1;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }
    //SETTERY - koniec

    //GETTERY - poczatek
    public Integer getN1() {
        return n1;
    }

    public Integer getN2() {
        return n2;
    }

    public Integer getN3() {
        return n3;
    }

    public Integer getN4() {
        return n4;
    }

    public Integer getN5() {
        return n5;
    }

    public Integer getN6() {
        return n6;
    }

    public Integer getN7() {
        return n7;
    }

    public Integer getN8() {
        return n8;
    }

    public Integer getN9() {
        return n9;
    }

    public Integer getN10() {
        return n10;
    }

    public Integer getL1() {
        return l1;
    }

    public Integer getL2() {
        return l2;
    }
    //GETTERY - koniec

    //METODA USTAWIAJACA L2 NA WARTOSC 4 - poczatek
    public Numbers() {
        l2 = 4;
    }
    //METODA USTAWIAJACA L2 NA WARTOSC 4 - koniec

    //METODA OBLICZAJACA ILOCZYN L1 I L2
    public void showMiltiply() {
        System.out.println(l1 + " * " + l2 + " = " + (l1 * l2));
    }
    //METODA OBLICZAJACA ILOCZYN L1 I L2

    //METODA WYLICZAJACA ILOCZYN Z OBIEKTOW n - poczatek
    public void obliczN() {
        int iloczynN = 1;
        final int[] n = new int[]{n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};

        for (int i = 0; i < n.length; i++) {
            iloczynN *= n[i];
        }
        System.out.println("Iloczyn n: " + iloczynN);
    }
}