package com.zenika;

public class Guitarist extends Musician implements Singer {

    public Guitarist(String name){
        super(name, "guitare");
    }

    @Override
    public void Sing() {
        System.out.printf("The %s %s sings while playing like a champ !", getClass().getSimpleName(), this.getName());
    }
}
