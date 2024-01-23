package com.zenika;

public abstract class Musician {
    String name;
    String instrument;
    public Musician( String instrument, String name ) {
        this.name = name;
        this.instrument = instrument;
    }

    public void play () {

    }

    @Override
    public String toString () {
     return String.format("Le %s %s joue %s", getClass().getSimpleName(), this.name, this.instrument);
    }
}
