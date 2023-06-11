package com.design.pattern;

import com.design.pattern.commands.OpenCloseCurtainsCommand;
import com.design.pattern.commands.SwitchLightsCommand;
import com.design.pattern.components.FloorLamp;
import com.design.pattern.components.Room;

public class Main {
    public static void main(String[] args) {
        /*
         * Video Reference: https://youtu.be/UfGD60BYzPM
         */
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());
    }
}