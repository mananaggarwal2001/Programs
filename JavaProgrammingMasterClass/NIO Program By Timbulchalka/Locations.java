package com.timbuchalka;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        Path locpath = FileSystems.getDefault().getPath("locations.dat");

        try (ObjectOutputStream locFile = new ObjectOutputStream(Files.newOutputStream(locpath))) {
            for (Location location : locations.values()) {
                locFile.writeObject(location);
            }
        }
    }

    static {

        Path locfile = FileSystems.getDefault().getPath("locations.dat");
        try (ObjectInputStream locdata = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(locfile)))) {
            boolean eof = false;
            while (!eof) {
                try {

                    Location location = (Location) locdata.readObject();
                    locations.put(location.getLocationID(),location);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (EOFException e) {
                    System.out.println(e.getMessage());
                    eof=true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //        Path locPath= FileSystems.getDefault().getPath("locations_big.txt");    // more strong class than file class although both works same
//        Path dirPath= FileSystems.getDefault().getPath("directions_big.txt");
//        try(BufferedWriter locfile = Files.newBufferedWriter(locPath);
//            BufferedWriter dirfile=Files.newBufferedWriter(dirPath)){
//
//            for(Location location:locations.values()){
//                System.out.println("Imported Log: " + location.getLocationID() + ": " + location.getDescription());
//                locfile.write(location.getLocationID() + " , " + location.getDescription());
//                for(String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        dirfile.write(location.getLocationID() + " , " + direction + " , " +
//                                location.getExits().get(direction) + "\n" );
//                    }
//                }
//            }
//
//        } catch (NoSuchFileException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

//    }


    //            try(Scanner scanner =new Scanner(Files.newBufferedReader(locfile));
//                Scanner scanner1 =new Scanner(Files.newBufferedReader(dirfile))){
//              scanner.useDelimiter(",");
//              scanner1.useDelimiter(",");
//              while(scanner.hasNextLine()){
//                 int loc=scanner.nextInt();
//                 scanner.skip(scanner.delimiter());
//                 String description = scanner.nextLine();
//                 System.out.println("Inported Loc: " + loc + ": " + description);
//
//                 Map<String,Integer> exits=new LinkedHashMap<>();
//                 int locId= scanner1.nextInt();
//                 scanner1.skip(scanner1.delimiter());
//                 String direction= scanner1.nextLine();
//                 scanner1.skip(scanner1.delimiter());
//                 int value=scanner1.nextInt();
//                 exits.put(direction,value);
//                 locations.put(loc,new Location(loc,description,exits));
//
//
//
//              }
//
//
//            } catch(IOException e){
//                e.printStackTrace();
//                System.out.println(e.getMessage());
//            }


//        try(ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
//            boolean eof = false;
//            while (!eof) {
//                try {
//                    Location location = (Location) locFile.readObject();
//                    System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
//                    System.out.println("Found " + location.getExits().size() + " exits");
//
//                    locations.put(location.getLocationID(), location);
//                } catch (EOFException e) {
//                    eof = true;
//                }
//            }
//        } catch(InvalidClassException e) {
//            System.out.println("InvalidClassException " + e.getMessage());
//        } catch(IOException io) {
//            System.out.println("IO Exception " + io.getMessage());
//        } catch(ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException " + e.getMessage());
//        }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
