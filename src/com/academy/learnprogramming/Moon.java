package com.academy.learnprogramming;

import java.util.Objects;

public class Moon extends HeavenlyBody{


    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    public String getMoonName() {
        return this.getName();
    }

    public double getOrbitTime() {
        return this.getOrbitalPeriod();
    }



}
