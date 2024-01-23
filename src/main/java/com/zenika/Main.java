package com.zenika;

public class Main {
    public static void main(String[] args) {
        Guitarist maxime = new Guitarist("maxime");
        BassPlayer leo = new BassPlayer("leo");
        Drummer marina = new Drummer("marina");

        maxime.play();
        leo.play();
        marina.play();
    }
}