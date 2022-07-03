abstract class telephone {
    abstract void disconnected();
    abstract void lift();
}

class smartphone extends telephone
{
    @Override
    void disconnected() {
        System.out.println("The Phone is Disconnected!!!!!!!!!!");
    }

    @Override
    void lift() {
        System.out.println("The phone is lifted to be disconnected");
    }

}
