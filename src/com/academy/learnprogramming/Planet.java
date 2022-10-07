package com.academy.learnprogramming;

import java.util.Set;

public class Planet extends HeavenlyBody {



    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    @Override
    public boolean addMoon(HeavenlyBody body, Moon moon) {
        return super.addMoon(body, moon);
    }


}
