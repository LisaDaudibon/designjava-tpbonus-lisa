package com.zenika;

public abstract class Musician {
    private final String name;
    private final String instrument;
    public Musician( String name, String instrument ) {
        this.name = name;
        this.instrument = instrument;
    }

    public void play () {
        System.out.printf("Le %s %s joue de la %s \n", getClass().getSimpleName(), this.name, this.instrument);
    }

}
