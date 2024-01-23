package com.zenika;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Musician {
    private final String name;
    private final String instrument;
    private final Set<MusicTypes> musicTypes = new HashSet<>();

    public Musician( String name, String instrument ) {
        this.name = name;
        this.instrument = instrument;
    }
    public Musician(String name, String instrument, ArrayList<MusicTypes> musicTypes) {
        this.name = name;
        this.instrument = instrument;
        this.musicTypes.addAll(musicTypes);
    }

    public String getName() {
        return name;
    }

    public ArrayList<MusicTypes> getMusicTypes() {
        return new ArrayList<>(musicTypes);
    }

    public void learnStyle(MusicTypes musicTypes) {
        this.musicTypes.add(musicTypes);
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
