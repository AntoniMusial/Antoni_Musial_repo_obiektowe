public class StaticFields {
    public static void main(String[] args) {
        Figura f1 = new Figura(10);
        Figura f2 = new Figura(50);
        Figura f3 = new Figura(77);

        System.out.println(f1.getClass().getName() + " -> " + f1.getPi() + " " + f1.getR());
        System.out.println(f2.getClass().getName() + " -> " + f2.getPi() + " " + f2.getR());
        System.out.println(f3.getClass().getName() + " -> " + f3.getPi() + " " + f3.getR());
        System.out.println("===========================");
        f1.setR(111);
        System.out.println(f1.getClass().getName() + " -> " + f1.getPi() + " " + f1.getR());
        System.out.println(f2.getClass().getName() + " -> " + f2.getPi() + " " + f2.getR());
        System.out.println(f3.getClass().getName() + " -> " + f3.getPi() + " " + f3.getR());
        System.out.println("===========================");
        f2.setPi(3);
    }
}
