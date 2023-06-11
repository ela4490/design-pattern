package com.design.pattern.commands;

import com.design.pattern.components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {

    @Override
    public void execute() {
        curtains.openClose();
    }

}
