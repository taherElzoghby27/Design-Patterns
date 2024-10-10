package com.mycompany.designpatterns.command_pattern.robot.concrete_commands;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.receiver.Robot;

public class MoveRightCommand implements Command {

    final Robot robot;

    public MoveRightCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.moveRight();
    }

    @Override
    public void undo() {
        robot.moveLeft();
    }

}
