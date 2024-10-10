package com.mycompany.designpatterns.command_pattern.robot;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.concrete_commands.MoveRightCommand;
import com.mycompany.designpatterns.command_pattern.robot.concrete_commands.MoveTopCommand;
import com.mycompany.designpatterns.command_pattern.robot.concrete_commands.PickupCommand;
import com.mycompany.designpatterns.command_pattern.robot.concrete_commands.SpeakCommand;
import com.mycompany.designpatterns.command_pattern.robot.invoker.MacroCommand;
import com.mycompany.designpatterns.command_pattern.robot.invoker.RobotControlSystem;
import com.mycompany.designpatterns.command_pattern.robot.receiver.Robot;

public class client {

    public static void main(String[] args) {
        Robot robot = new Robot();
        Command[] commands = {new PickupCommand(robot), new MoveRightCommand(robot), new SpeakCommand(robot), new MoveTopCommand(robot)};
        MacroCommand macro = new MacroCommand(commands);
        RobotControlSystem robotClient = new RobotControlSystem();
        robotClient.setCommand(0, macro);
        robotClient.pressButton(0);
        robotClient.pressUndoButton(0);
    }
}
