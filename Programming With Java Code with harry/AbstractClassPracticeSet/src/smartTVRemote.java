interface TVremote{
    void powerOff();
    void PowerOn();
    void numbersOfChannel();
}

interface smartTVRemote extends TVremote{
    void ChannelSuggestion();
    void Microphone();
    void Speaker();
}



class TV implements TVremote{
    @Override
    public void powerOff() {
        System.out.println("Switching off the TV");
    }

    @Override
    public void PowerOn() {
        System.out.println("Switching on the TV");
    }

    @Override
    public void numbersOfChannel() {
        System.out.println("There are the keys Present in the keyboard ranging from 0-9");
    }
}
