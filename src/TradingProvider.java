import javax.management.OperationsException;
import java.util.ArrayList;
public class TradingProvider {
    ArrayList<Order> orderArrayList;
    {orderArrayList = new ArrayList<>();}
    public boolean NotEmptyOrders(){
        return !orderArrayList.isEmpty();
    }
    public int SendOrders(String symbol, int price, int volume, String type){
        int id = orderArrayList.size();
        orderArrayList.add(new Order(symbol, price, volume, id, type));
        return id;
    }
    public boolean CancelOrder(int id){
        if(orderArrayList.get(id)!=null){
            orderArrayList.remove(id);
            return true;
        }else{
            return false;
        }
    }
    public void printOrders(){
        for(Order iter:orderArrayList){
            System.out.println(iter.toString());
        }
    }
}
