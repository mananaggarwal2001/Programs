package com.company;

import java.util.*;

public class Location {
    private final int location;
    private final String description;
    private final Map<String ,Integer> exits;

    public Location(int location, String description,Map<String,Integer> exits) {
        this.location = location;
        this.description = description;
        this.exits = new HashMap<>(exits); // create copies of the exits map so that internal maps cant be affected.
    }
//    public void addExit(String directions,int number)
//    {
//        exits.put(directions,number);
//    }
   public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
