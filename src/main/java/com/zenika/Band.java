package com.zenika;

import com.zenika.exception.GetOutOfMyWayException;
import com.zenika.musician.MusicTypes;
import com.zenika.musician.Musician;
import com.zenika.musician.Singer;

import java.util.HashSet;
import java.util.Set;

public class Band {
    private final Set<Musician> musicians = new HashSet<>();

    private final MusicTypes musicType;

    public Band(MusicTypes musicType) {
        this.musicType = musicType;
    }

    public void hireMusician(Musician musician) throws GetOutOfMyWayException {
        if(musician.getMusicTypes().contains(musicType)){
            musicians.add(musician);
        } else {
            throw new GetOutOfMyWayException();
        }
    }

    public void play() {
        musicians.forEach(musician -> {
            musician.play();
            if(musician instanceof Singer) {
                ((Singer) musician).sing();
            }
        });
    }
}
