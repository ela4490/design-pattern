package com.design.pattern;

import com.design.pattern.model.CarBuilder;
import com.design.pattern.model.CarSchemaBuilder;

public class Main {
    /*
     * Video Reference: https://youtu.be/MaY_MDdWkQw
     */
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder);
        schemaBuilder.engine("90").nbrOfDoors(3);
        System.out.println(schemaBuilder.build());

    }
}