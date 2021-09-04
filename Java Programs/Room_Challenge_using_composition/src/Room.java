public class Room {
    private Bed bed;
    private Almirah almirah;

    public Room(Bed bed, Almirah almirah) {
        this.bed = bed;
        this.almirah = almirah;
    }

    public Bed getBed() {
        return bed;
    }

    public Almirah getAlmirah() {
        return almirah;
    }
}
