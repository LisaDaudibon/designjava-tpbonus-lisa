package com.zenika;

import com.zenika.exception.GetOutOfMyWayException;
import com.zenika.musician.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Musician> musicians = new ArrayList<>();

        Musician hugo = new Guitarist("Hugo");
        hugo.learnStyle(MusicTypes.POP);
        hugo.learnStyle(MusicTypes.ROCK);

        Musician magda = new Guitarist("Magda");
        magda.learnStyle(MusicTypes.METAL);
        magda.learnStyle(MusicTypes.JAZZ);

        Musician linh = new Drummer("Linh");
        linh.learnStyle(MusicTypes.REGGAE);
        linh.learnStyle(MusicTypes.METAL);

        Musician lea = new BassPlayer("Lea");
        lea.learnStyle(MusicTypes.METAL);

        musicians.add(hugo);
        musicians.add(magda);
        musicians.add(linh);
        musicians.add(lea);

        Band oneVerification = new Band(MusicTypes.METAL);

        for(Musician musician: musicians) {
            try {
                oneVerification.hireMusician(musician);
            } catch (GetOutOfMyWayException exception) {
                System.out.printf("The %s %s leaves crying %n", musician.getClass().getSimpleName(), musician.getName());
            }
        }
        oneVerification.play();
    }
}