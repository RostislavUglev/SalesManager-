

public class Main {
    public static void main(String[] args) {
        int [] sales = {70, 35, 10, 60, 25};
        SalesManager salesManager = new SalesManager (sales);
        int maxSales = salesManager.max();
        System.out.println (maxSales);
        int averageSales = salesManager.average();
        System.out.println (averageSales);
    }

}
