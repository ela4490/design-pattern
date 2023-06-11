package com.design.pattern.commands;

import com.design.pattern.components.Light;

public record SwitchLightsCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.switchLights();
    }

}
