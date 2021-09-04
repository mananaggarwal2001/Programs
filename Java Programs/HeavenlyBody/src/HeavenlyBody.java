import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public  class HeavenlyBody {
    private final double OrbitalSpeed;
    private final Set<HeavenlyBody> satellites;
    private final key key;
    public enum Bodytypes{
        MOON,
        PLANET,
        DWARFPLANET
    }


    public HeavenlyBody(String name, double orbitalSpeed,Bodytypes bodytypes) {
        this.OrbitalSpeed = orbitalSpeed;
        this.satellites = new HashSet<>();
        this.key=new key(name,bodytypes);
    }

    public double getOrbitalSpeed()

    {
        return OrbitalSpeed;
    }

    public HeavenlyBody.key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody Moon)
    {
        return this.satellites.add(Moon);
    }

    public Set<HeavenlyBody> getSatellites()
    {
        return new HashSet<>(satellites);
    }
    public static key makekey(String name,Bodytypes bodytypes ){
        return new key(name,bodytypes);
    }
    @Override
    public final boolean equals(Object obj){
       if(this==obj){   //this refering to the present class in which we are tying the code and we have made an object in the equal method.
           return true;
       }
        System.out.println("Object.getclass()"+ obj.getClass());
        System.out.println("This.getclass()"+this.getClass());
              String objname=((HeavenlyBody) obj).getKey().getName();
              if(obj instanceof HeavenlyBody){
                HeavenlyBody theObject=(HeavenlyBody) obj;
                return this.key.equals(theObject.getKey());
              }
       return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return  this.key.getName()+" : " +this.OrbitalSpeed +" : "+this.key.getBodytypes();
    }

    public static final class key{
        private String name;
        private Bodytypes bodytypes;

        private key(String name, Bodytypes bodytypes) {
            this.name = name;
            this.bodytypes = bodytypes;
        }

        public String getName() {
            return name;
        }

        public Bodytypes getBodytypes() {
            return bodytypes;
        }
        @Override
        public boolean equals(Object obj){
            key key=(key)obj;
            if(this.name.equals(key.getName())){
                return (this.bodytypes==key.getBodytypes());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode()+57+this.bodytypes.hashCode();
        }

        @Override
        public String toString() {
            return this.name+this.bodytypes;
        }
    }
}
