package com.company;

import java.lang.invoke.VolatileCallSite;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations=new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> tempexit=new HashMap<>();
        locations.put(0,new Location(0,"you are sitting in front of the computer leaning java",tempexit));

        tempexit=new HashMap<>();
        tempexit.put("N",2);
        tempexit.put("W",3);
        tempexit.put("E",4);
        tempexit.put("S",5);
        locations.put(1,new Location(1,"ypu are standing at the end of the road before a small brick building",tempexit));

         tempexit=new HashMap<>();
        tempexit.put("N",5);
        locations.put(2,new Location(2,"you are at a top of a hill",tempexit));


        tempexit.put("W",1);
        locations.put(3,new Location(3,"you are inside the building a well house for a small being ",tempexit));



         tempexit=new HashMap<>();
        tempexit.put("N",1);
        tempexit.put("W",2);
        locations.put(4,new Location(4,"you are ina valley beside the stream",tempexit));
        
         tempexit=new HashMap<>();
        tempexit.put("S",1);
        tempexit.put("W",2);
        locations.put(5,new Location(5,"ypu are in the Forest",tempexit));

        Map<String,String> vocabulary=new HashMap<>();
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");
        vocabulary.put("QUIT","Q");




        int loc=1;
         while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }
            Map<String,Integer> exits=locations.get(loc).getExits();
             System.out.print("Available locations: ");

            for(String exit:exits.keySet()){
                System.out.print(exit +" , ");
            }
             System.out.println();

            String directions=scanner.nextLine().toUpperCase();
            if(directions.length()>1){
                String[] words=directions.split(" ");
                for(String word:words){
                    if(vocabulary.containsKey(word)){
                        directions=vocabulary.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(directions)){
                loc=exits.get(directions);
            }else{
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
