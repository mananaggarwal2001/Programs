public class SharedResource {
    private Worker worker;

    public SharedResource(Worker worker) {
        this.worker = worker;
    }

    public Worker getOwner() {
        return worker;
    }

    public synchronized void setOwner(Worker worker) {
        this.worker = worker;
    }

}
