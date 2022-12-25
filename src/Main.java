public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        int buy = robot.Buy("Buy products", 200, 50);
        robot.getMarketInfo();
        robot.Sell("Sell products", 200, 60);
        robot.getMarketInfo();
        robot.printOrders();
        robot.Cancel(buy);
        robot.printOrders();

    }
}