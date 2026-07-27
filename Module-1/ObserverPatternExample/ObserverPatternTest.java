public class ObserverPatternTest {

    public static void main(String[] args) {

        // Create Stock Market
        StockMarket stockMarket = new StockMarket("TCS");

        // Create Observers
        Observer mobileUser = new MobileApp("Harshita");
        Observer webUser = new WebApp("Priya");

        // Register Observers
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        // Update Stock Price
        stockMarket.setStockPrice(3500.50);

        stockMarket.setStockPrice(3650.75);

        // Remove Observer
        stockMarket.removeObserver(webUser);

        System.out.println("\nWeb User Unsubscribed!");

        stockMarket.setStockPrice(3800.00);
    }
}