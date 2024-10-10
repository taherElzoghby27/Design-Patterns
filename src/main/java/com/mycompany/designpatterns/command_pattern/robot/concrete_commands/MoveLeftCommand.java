package com.mycompany.designpatterns.command_pattern.robot.concrete_commands;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.receiver.Robot;

public class MoveLeftCommand implements Command {

    final Robot robot;

    public MoveLeftCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.moveLeft();
    }

    @Override
    public void undo() {
        robot.moveRight();
    }

}
