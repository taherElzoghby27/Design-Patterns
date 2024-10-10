package com.mycompany.designpatterns.command_pattern.book_ex.commands;

import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Light;

public class LightOnCommand implements Command {

    protected Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
