package com.design.pattern;

public class Main {
    /*
     * Video Reference: https://youtu.be/cGoVDzHvD4A
     */
    public static void main(String[] args) {

        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("==========================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();

    }
}