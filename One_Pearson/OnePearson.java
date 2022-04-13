public class OnePearson {
    private String name;
    private String last_name;
    private int earn;
}

    public void readFromCSV(File file, String separator) throws FileNotFoungExpection {
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String[tab] = sc.nextLine().split(separator);
            showTableContent(tab);
        }
    }

    public OnePearson(String name, String last_name, int earn) {
        this.name = name;
        this.last_name = last_name;
        this.earn = earn;
    }