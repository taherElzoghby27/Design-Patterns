package com.mycompany.designpatterns.command_pattern.book_ex;

public class LightOnCommand extends Command {

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
