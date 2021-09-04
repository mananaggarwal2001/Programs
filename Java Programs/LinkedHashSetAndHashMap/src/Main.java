import java.util.Map;

public class Main {
    private static Stocklist stocklist=new Stocklist();
    public static void main(String[] args) {
        Stockitem stockitem=new Stockitem("Car",2,12);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("Bus",120,13);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("scooter",30,2);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("Van",300,5);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("Audi",4000,6);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("Mercerdies",4000,7);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("Toyata",400,19);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("Bullera",500,23);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("Auto",12,12);
        stocklist.addStock(stockitem);

        stockitem=new Stockitem("rickshaw",200,15);
        stocklist.addStock(stockitem);

//        for(String stockitem1:stocklist.lists().keySet()){
//            System.out.println(stockitem1);
//        }

        Basket basket=new Basket("Manan Basket");
        sellitem(basket,"rickshaw",11);
        sellitem(basket,"Auto",12);
        sellitem(basket,"Toyata",13);
        sellitem(basket,"Bullera",12);
        System.out.println(basket);




//        for(Map.Entry<String,Stockitem> item:stocklist){
//            System.out.println(item);
//        }
//        System.out.println(stocklist);
//
//        System.out.println(stocklist.sellstock("Auto",15));

    }
    public static int sellitem(Basket basket,String item,int quantity){
        // retreve the stockitem from the list
        Stockitem stockitem= stocklist.get(item);
        if(stockitem==null){
            System.out.println("This Stockitem is not available");
            return 0;
        }
        if(stocklist.reserveStock(item,quantity)!=0){
            return basket.inbasket(stockitem,quantity);
        }
        return 0;
    }
    public static int removeitem(Basket basket,String item,int quantity){
        // retreve the stockitem from the list
        Stockitem stockitem= stocklist.get(item);
        if(stockitem==null){
            System.out.println("This Stockitem is not available");
            return 0;
        }
        if(basket.removeFromBasket(stockitem,quantity)==quantity){
            return stocklist.unreserveStock(item,quantity);
        }
        return 0;
    }
    public void Checkout(Basket basket){
        for(Map.Entry<Stockitem,Integer>item:basket.Items().entrySet()){
            stocklist.sellstock(item.getKey().getName(),item.getValue());
        }
        basket.clearBasket();
    }
}
