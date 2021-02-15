public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            Car car = isCar();
                    System.out.println(" Optional Features was " + car.getOptional_Features() +"\n"+
                    " Name Was " +car.getModel_name() +"\n");
        }
    }
    public static Car isCar(){
            int randomvariable= (int)(Math.random() * 3) +1;
            System.out.println(" Random Number Was: "+ randomvariable);
            switch(randomvariable){
                case 1:
                    return new Audi();
                case 2:
                    return new WagonR();
                case 3:
                    return new swift();
                default:
                    System.out.println("Wrong Choice");
                    break;

            }
        return null;
    }
}
