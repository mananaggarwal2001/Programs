import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Stocklist {
    private final Map<String,Stockitem> list;

    public Stocklist() {
        list=new HashMap<>();
    }
    public int addStock(Stockitem item){
        if(item!=null){
            // check if there are already quantity in the stockitems
            Stockitem instock=list.getOrDefault(item.getName(),item);
            // if there is already one adjust the stock
            if(instock!=item){
                instock.adjuststock(item.AvailableStocks());
            }
            list.put(item.getName(), item);
            return item.AvailableStocks();
        }
        return 0;
    }
    public int sellstock(String item,int quantity){
        Stockitem instock=list.get(item);
        if((instock!=null) && (quantity>0)){
            return instock.finalizestock(quantity);
        }
        return 0;

//        Stockitem instock=list.getOrDefault(item,null);
//        if((quantity<instock.AvailableStocks()) && (quantity!=0)){
//            instock.adjuststock(-quantity);
//            return quantity;
//        }
//        return 0;
    }
    public Stockitem get(String key)

    {
        return list.get(key);
    }
    public int reserveStock(String item,int quantity){
        Stockitem instock=list.get(item);
        if((instock!=null) && (quantity>0)){
            return instock.reservestock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item,int quantity){
        Stockitem instock=list.get(item);
        if((instock!=null) && (quantity>0)){
            return instock.unreserve(quantity);
        }
        return 0;
    }


    public Map<String ,Stockitem> lists(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        double totalcost=0.0;
        String s="\nStock List\n";
        for(Map.Entry<String,Stockitem> item:list.entrySet()){
            Stockitem stockitem=item.getValue();
            double itemvalue= stockitem.AvailableStocks() * stockitem.getPrice();
            s=stockitem+" There are this much of stockitem " + stockitem.AvailableStocks() + " Value of the Stockitem is: ";
            s=s+ String.format("%.2f",itemvalue); // %.2f means it wil show upto two decimal points.
            System.out.println(s);
            totalcost+=itemvalue;
        }
        return "The total Stock value: " +  totalcost;
    }
}
