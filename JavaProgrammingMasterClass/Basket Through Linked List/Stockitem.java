public class Stockitem implements Comparable<Stockitem> {
    private final String name;
    private double price;
    private int quantityinStock;
    private int reservefeild;

    public Stockitem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityinStock =0;
    }

    public Stockitem(String name, double price, int quantityinStock) {
        this.name = name;
        this.price = price;
        this.quantityinStock = quantityinStock;
    }

    public String getName() {
        return name;
    }
    public int finalizestock(int quantity){
        if(quantity<=reservefeild){
            quantityinStock-=quantity;
            reservefeild-=quantity;
            return quantity;
        }
        return 0;
    }
    public int reservestock(int quantity){ //use the method not the feild
        if(quantity<= AvailableStocks()){
            reservefeild+=quantity;
            return quantity;
        }
        return 0;
    }
    public int unreserve(int quantity){
        if(quantity<=reservefeild){
            reservefeild-=quantity;
            return quantity;
        }
        return 0;
    }

    public double getPrice() {
        return price;
    }

    public int AvailableStocks() {
        return quantityinStock -reservefeild;
    }

    public void setPrice(double price) {
        if(price>0.0)
        this.price = price;
    }
    public void adjuststock(int quantity){
        int newquantity= this.quantityinStock +quantity;
        if(newquantity>=0){
            this.quantityinStock =newquantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null|| this.getClass()!=obj.getClass()){
            return false;
        }
        String objname= ((Stockitem)obj).getName();
        return this.name.equals(objname);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() +57;
    }

    @Override
    public int compareTo(Stockitem o) {
        if(this==o){
            return 0;
        }
        if(o!=null){
            this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return " Name: " + this.name + " Price: "+ this.price +" .reserved "+this.reservefeild;
    }

    public void setReservefeild(int reservefeild) {
        this.reservefeild = reservefeild;
    }
}
