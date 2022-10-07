package com.academy.learnprogramming;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Set<Planet> planets;
    private final Set<Moon> moons;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.moons = new HashSet<>();
        this.planets = new HashSet<>();
    }

    public String getName() {
        String nameCopy = name;
        return nameCopy;
    }

    public double getOrbitalPeriod() {
        Double orbitz = orbitalPeriod;
        return orbitz;
    }

    public boolean addMoon(HeavenlyBody body, Moon moon) {
         if (body.getClass() == Planet.class) {
             return body.moons.add(moon);
         }else {
             System.out.println("You can only add a moon to a planet! "+body.getName()+" is a(n) "+body.getClass());
         }
         return false;
    }

    public boolean addPlanet(Planet planet) {
        return this.planets.add(planet);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public Set<Moon> getMoons() {
        return new HashSet<>(this.moons);
    }


    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }
        System.out.println("The name of the object type" + obj.getClass());
        System.out.println("is the same as the name of " + this.getClass());
        System.out.println("No new "+obj.getClass()+" will be added, as there can be no duplicate keys on the list");
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        //System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }
}
