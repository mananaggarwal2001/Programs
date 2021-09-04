import java.util.*;

public class Main {
    private static Map<HeavenlyBody.key, HeavenlyBody> solarsystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<HeavenlyBody> bodytype = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Mars",850);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempmoon = new Moon("Moon", 27);
        solarsystem.put(tempmoon.getKey(), tempmoon);
        temp.addSatellite(tempmoon);

        temp = new Planet("mars", 420);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempmoon = new Moon("Decimos", 1.3);
        solarsystem.put(tempmoon.getKey(), tempmoon);
        temp.addSatellite(tempmoon);

        tempmoon = new Moon("Phobos", 0.3);
        solarsystem.put(tempmoon.getKey(), temp);
        temp.addSatellite(tempmoon);

        temp = new Planet("jupiter", 4332);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempmoon = new Moon("I.O", 1.8);
        solarsystem.put(tempmoon.getKey(), tempmoon);
        temp.addSatellite(tempmoon);

        tempmoon = new Moon("Europa", 3.5);
        solarsystem.put(tempmoon.getKey(), tempmoon);
        temp.addSatellite(tempmoon);


        tempmoon = new Moon("Ganyamede", 7.1);
        solarsystem.put(tempmoon.getKey(), tempmoon);
        temp.addSatellite(tempmoon);


        tempmoon = new Moon("Callisto", 16.8);
        solarsystem.put(tempmoon.getKey(), tempmoon);
        temp.addSatellite(tempmoon);

        temp = new Planet("Saturn", 10759);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarsystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets is ");
        for (HeavenlyBody planets : planets) {
            System.out.println(planets);  // to string is automatically invoked
        }

        HeavenlyBody moons=solarsystem.get(HeavenlyBody.makekey("Mars",HeavenlyBody.Bodytypes.PLANET));
        System.out.println("Moons in "+ moons.getKey().getName());
        for(HeavenlyBody jupitermoon : moons.getSatellites()){
            System.out.println("\t"+jupitermoon.getKey().getName());
        }
        Set<HeavenlyBody> Hmoons= new HashSet<>();
        for(HeavenlyBody planet:planets){
            Hmoons.addAll(planet.getSatellites());
        }
        HeavenlyBody Pluto=new DwarfPlanet("Pluto",823);
        for(HeavenlyBody moon:Hmoons){
            System.out.println(moon.getKey().getName());

        }
        solarsystem.put(Pluto.getKey(),Pluto);

        System.out.println(solarsystem.get(HeavenlyBody.makekey("Pluto",HeavenlyBody.Bodytypes.PLANET)));
        System.out.println(solarsystem.get(HeavenlyBody.makekey("Pluto",HeavenlyBody.Bodytypes.DWARFPLANET)));
        for(HeavenlyBody heavenlyBody:solarsystem.values()){
            System.out.println(heavenlyBody);
        }
        }
    }




