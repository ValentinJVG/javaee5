package MainTaskNamedStock;

public class Main {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.setPreviousClosingPrice (34.5);
        oracle.setCurrentPrice (34.35);
        System.out.println("change: %.2f%%", oracle.get);
    }
}
