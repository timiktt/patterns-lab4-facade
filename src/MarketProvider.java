import java.util.Random;
public class MarketProvider {
    Random randomPrice;
    {randomPrice = new Random();}
    public int MarketUpdate(){
        return randomPrice.nextInt();
    }
}
