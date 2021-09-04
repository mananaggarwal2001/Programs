public class Floor {
    private double width;
    private double height;

    public Floor(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }

    public double getArea(){
        return (this.width*this.height);
    }
}
class Carpet{
    private double cost;
    Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost(){
        return cost;
    }

}
class Calculator{
    private Floor floor;
    private Carpet carpet;
    Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getTotalCost(){
    return (floor.getArea()*carpet.getCost());
    }
}

