public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 2147483647;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

public int average() {
        int allSales = 0;
        for(int sale : sales) {
            allSales=allSales+sale;
        }
        int salesQuantity = sales.length;
        int max = max();
        int min = min();
        int average = (allSales-max-min)/(salesQuantity-2);

        return average;
}

}
