public class cuboid extends rectangle {
public static float height;
    cuboid() {
        System.out.println(" I am the default constructor for the cuboid");
    }
    cuboid(float length, float breadth, float height){
        super(length, breadth);
        cuboid.height = height;
    }

    public static float getHeight() {
        return height;
    }

    public static void setHeight(float height) {
        cuboid.height = height;
    }

    @Override
    void Area() {
        System.out.println("The curved Surface Area of the cuboid is :- " + 2*height*(length + breadth));
    }

    void volume(){
        System.out.println("The Volume of the cuboid is :- " + (height* breadth*length));
    }
}
