public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String roll_type;

    private String Additionname1;
    private double Additionprice1=50;
    private String Additionname2;
    private double Additionprice2=50;
    private String Additionname3;
    private double Additionprice3=50;
    private String Additionname4;
    private double Additionprice4=50;

    public Hamburger(String name, String meat, double price, String roll_type) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.roll_type = roll_type;
    }

    public void setAdditionname1(String additionname1) {
        Additionname1 = additionname1;
    }

    public void setAdditionname2(String additionname2) {
        Additionname2 = additionname2;
    }

    public void setAdditionname3(String additionname3) {
        Additionname3 = additionname3;
    }

    public void setAdditionname4(String additionname4) {
        Additionname4 = additionname4;
    }

    public String getAdditionname1() {
        return Additionname1;
    }

    public String getAdditionname2() {
        return Additionname2;
    }

    public String getAdditionname3() {
        return Additionname3;
    }

    public String getAdditionname4() {
        return Additionname4;
    }

    public void setAdditionprice1() {
        Additionprice1 = 50;
    }

    public void setAdditionprice2() {
        Additionprice2 = 50;
    }

    public void setAdditionprice3() {
        Additionprice3 = 50;
    }

    public void setAdditionprice4() {
        Additionprice4 = 50;
    }

    public double getAdditionprice1() {
        return Additionprice1;
    }

    public double getAdditionprice2() {
        return Additionprice2;
    }

    public double getAdditionprice3() {
        return Additionprice3;
    }

    public double getAdditionprice4() {
        return Additionprice4;
    }
    public double getPrice(){
        return price;
    }

    public void displaybill(){
        System.out.println(" 1.Addition item " + Additionname1 + " Price is :" + getAdditionprice1());
        System.out.println(" 2.Addition item " + Additionname2 + " Price is :" + getAdditionprice2());
        System.out.println(" 3.Addition item " + Additionname3 + " Price is :" + getAdditionprice3());
        System.out.println(" 4.Addition item " + Additionname4 + " Price is :" + getAdditionprice4());
        System.out.println(" Total Price is : " + (getPrice()+getAdditionprice1()+getAdditionprice2()+getAdditionprice3()+getAdditionprice4()));
    }
}
class Healthy_burger extends Hamburger{
    public Healthy_burger() {
        super("Healthy_Burger","strong Meat",100,"On a brown rye bread roll");
    }

    @Override
    public void setAdditionname1(String additionname1) {
        super.setAdditionname1(additionname1);
    }

    @Override
    public void setAdditionname2(String additionname2) {
        super.setAdditionname2(additionname2);
    }

    @Override
    public void setAdditionname3(String additionname3) {
        super.setAdditionname3(additionname3);
    }

    @Override
    public void setAdditionname4(String additionname4) {
        super.setAdditionname4(additionname4);
    }

    @Override
    public String getAdditionname1() {
        return super.getAdditionname1();
    }

    @Override
    public String getAdditionname2() {
        return super.getAdditionname2();
    }

    @Override
    public String getAdditionname3() {
        return super.getAdditionname3();
    }

    @Override
    public String getAdditionname4() {
        return super.getAdditionname4();
    }

    @Override
    public void setAdditionprice1() {
        super.setAdditionprice1();
    }

    @Override
    public void setAdditionprice2() {
        super.setAdditionprice2();
    }

    @Override
    public void setAdditionprice3() {
        super.setAdditionprice3();
    }

    @Override
    public void setAdditionprice4() {
        super.setAdditionprice4();
    }

    @Override
    public double getAdditionprice1() {
        if (getAdditionname1() == null) {
            return 0;
        } else
            return super.getAdditionprice1();
    }

    @Override
    public double getAdditionprice2() {
        if (getAdditionname2() == null) {
            return 0;
        } else {
            return super.getAdditionprice2();
        }
    }

    @Override
    public double getAdditionprice3() {
        if (getAdditionname3() == null) {
            return 0;
        } else {
            return super.getAdditionprice3();
        }
    }

    @Override
    public double getAdditionprice4() {
        if(getAdditionname4()==null){
            return 0;
        }else{
            return super.getAdditionprice4();
        }

    }

    @Override
    public void displaybill() {
        super.displaybill();
    }
}
class delux_burger extends Hamburger{
        private double chips=100;
        private double colddrinks=200;
    public delux_burger() {
        super("delux Burger","chicken",400,"bread roll");
    }


    public void setAdditionname1() {
        super.setAdditionname1(null);
    }


    public void setAdditionname2() {
        super.setAdditionname2(null);
    }


    public void setAdditionname3() {
        super.setAdditionname3(null);
    }

    public void setAdditionname4() {
        super.setAdditionname4(null);
    }

    @Override
    public String getAdditionname1() {
        return super.getAdditionname1();
    }

    @Override
    public String getAdditionname2() {
        return super.getAdditionname2();
    }

    @Override
    public String getAdditionname3() {
        return super.getAdditionname3();
    }

    @Override
    public String getAdditionname4() {
        return super.getAdditionname4();
    }

    @Override
    public void setAdditionprice1() {
        super.setAdditionprice1();
    }

    @Override
    public void setAdditionprice2() {
        super.setAdditionprice2();
    }

    @Override
    public void setAdditionprice3() {
        super.setAdditionprice3();
    }

    @Override
    public void setAdditionprice4() {
        super.setAdditionprice4();
    }

    @Override
    public double getAdditionprice1() {
        if (getAdditionname1() == null) {
            return 0;
        } else {
            return super.getAdditionprice1();
        }
    }

    @Override
    public double getAdditionprice2() {
        if (getAdditionname2() == null) {
            return 0;
        } else {
            return super.getAdditionprice2();
        }
    }

    @Override
    public double getAdditionprice3() {
        if (getAdditionname3() == null) {
            return 0;
        } else {
            return super.getAdditionprice3();
        }
    }

    @Override
    public double getAdditionprice4() {
        if (getAdditionname4() == null) {
            return 0;
        } else {
            return super.getAdditionprice4();
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public void display(){
        System.out.println(" 1.Addition item " + getAdditionname1() + " Price is :" + getAdditionprice1());
        System.out.println(" 2.Addition item " + getAdditionname2() + " Price is :" + getAdditionprice2());
        System.out.println(" 3.Addition item " + getAdditionname3() + " Price is :" + getAdditionprice3());
        System.out.println(" 4.Addition item " + getAdditionname4() + " Price is :" + getAdditionprice4());
        System.out.println(" Total Price is : " + (colddrinks+chips+getPrice()+getAdditionprice1()+getAdditionprice2()+getAdditionprice3()+getAdditionprice4()));
    }
}
