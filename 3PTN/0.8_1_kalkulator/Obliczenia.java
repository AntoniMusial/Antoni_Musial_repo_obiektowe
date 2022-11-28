public class Obliczenia {
    public double l1;
    public double l2;
    String znak;

    public void obliczeniaDodawanie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " + " + l2 + " = " + (l1 + l2) + "\n=====================");
    }

    public void obliczeniaOdejmowanie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " - " + l2 + " = " + (l1 - l2) + "\n=====================");
    }

    public void obliczeniaMnozenie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " * " + l2 + " = " + (l1 * l2) + "\n=====================");
    }

    public void obliczeniaDzielenie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " ÷ " + l2 + " = " + (l1 / l2) + "\n=====================");
    }

    public void obliczeniaPotega(double l1, double l2) {
        double potega = Math.pow(l1, l2);
        System.out.println("\nWynik: " + l1 + " ^ " + l2 + " = " + potega + "\n=====================");
    }

    public void obliczeniaPierwiastek(double l1) {
        double pierwiastek = Math.sqrt(l1);
        System.out.println("\nWynik: " + "√" + l1 + " = " + pierwiastek + "\n=====================");
    }
}
