public class PC {
    private Monitor monitor;
    private Case thecase;
    private Motherboard motherboard;

    public PC(Monitor monitor, Case thecase, Motherboard motherboard) {
        this.monitor = monitor;
        this.thecase = thecase;
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getThecase() {
        return thecase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

}
