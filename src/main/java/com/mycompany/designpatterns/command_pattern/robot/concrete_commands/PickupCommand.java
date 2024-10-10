package com.mycompany.designpatterns.command_pattern.robot.concrete_commands;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.receiver.Robot;

public class PickupCommand implements Command {

    final Robot robot;

    public PickupCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.pickup();
    }

    @Override
    public void undo() {
        robot.drop();
    }

}
