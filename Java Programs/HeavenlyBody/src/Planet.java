public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalSpeed) {
        super(name, orbitalSpeed,Bodytypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody Moon) {
        if (Moon.getKey().getBodytypes() == Bodytypes.MOON) {
            return super.addSatellite(Moon);
        }
        return false;
    }
}
