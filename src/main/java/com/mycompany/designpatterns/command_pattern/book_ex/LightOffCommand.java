package com.mycompany.designpatterns.command_pattern.book_ex;

public class LightOffCommand extends Command {

    protected Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
