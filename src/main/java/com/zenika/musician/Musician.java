package com.zenika;

import java.util.Objects;

public abstract class Musician {
    private final String name;
    private final String instrument;
    public Musician( String name, String instrument ) {
        this.name = name;
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public void play () {
        System.out.printf("Le %s %s joue de la %s \n", getClass().getSimpleName(), this.name, this.instrument);
    }

    @Override
    public boolean equals(Object objectToCompare) {
        if (Objects.nonNull(objectToCompare)) {
            return this.getClass().equals(objectToCompare.getClass());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }
}
