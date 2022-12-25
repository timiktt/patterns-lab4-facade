public class Robot {
    MarketProvider marketProvider = new MarketProvider();
    TradingProvider tradingProvider = new TradingProvider();

    public int Buy(String symbol, int price, int volume){
        return tradingProvider.SendOrders(symbol, price, volume, "Buy");
    }
    public int Sell(String symbol, int price, int volume){
        return tradingProvider.SendOrders(symbol, price, volume, "Sell");
    }
    public boolean Cancel(int id){
        return tradingProvider.CancelOrder(id);
    }

    public void getMarketInfo(){
        if (tradingProvider.NotEmptyOrders()){
            System.out.println("Price on market: " + marketProvider.MarketUpdate());
        }
        else{
            System.out.println("Orders in empty");
        }
    }
    public void printOrders(){
        if (tradingProvider.NotEmptyOrders()){
            tradingProvider.printOrders();
        }
        else {
            System.out.println("Orders in empty");
        }
    }
}
