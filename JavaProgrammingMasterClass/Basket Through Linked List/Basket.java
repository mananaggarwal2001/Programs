import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<Stockitem,Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list=new HashMap<>();
    }
    public int inbasket(Stockitem item,int quantity){
        if(item!=null &&(quantity>0)){
            int inBasket=list.getOrDefault(item,0);
            list.put(item,quantity + inBasket);
            return inBasket;
        }
        return 0;
    }
    public int removeFromBasket(Stockitem stockitem, int quantity){
        if((stockitem!=null) && (quantity>0)){
            // check if we have a item in the basket
            int instock=list.getOrDefault(stockitem,0);
            int newQuantity=instock-quantity;
            if(newQuantity>0){
                list.put(stockitem,newQuantity);
                return quantity;
            }else if(newQuantity==0){
                list.remove(stockitem);
                return quantity;
            }
        }
        return 0;
    }
    public void clearBasket(){
        this.list.clear();
    }

    public Map<Stockitem,Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s=" Shopping Basket  "+name+" Contains " + list.size() +" items ";
        double totalcost=0.0;
        for(Map.Entry<Stockitem,Integer> items:list.entrySet()){
            s=s + items.getKey()+ " item value " +items.getValue()+" purchased ";
            totalcost=items.getKey().getPrice()*items.getValue();
        }
        return s+ " totalcost is: "+totalcost;
    }

}
