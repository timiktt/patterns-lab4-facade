public class Order {
    private String symbol;
    private int price;
    private int volume;
    private int id;
    private String type;//1-buy, 2-sell
    public Order(String symbol, int price, int volume, int id, String type){
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.id = id;
        this.type = type;
    }

    public String getSymbol(){
        return symbol;
    }
    public int getPrice(){
        return price;
    }
    public int getVolume(){
        return volume;
    }
    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return  "Oreder: "+
                " symbol = " + symbol +
                " price = " + price +
                " volume = " + volume +
                " id = " + id +
                " type = " + type;

    }
}
