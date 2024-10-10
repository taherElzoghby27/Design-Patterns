package com.mycompany.designpatterns.command_pattern.robot.concrete_commands;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.receiver.Robot;

public class SpeakCommand implements Command {

    final Robot robot;

    public SpeakCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.speak();
    }

    @Override
    public void undo() {
        robot.silent();
    }

}
