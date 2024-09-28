package com.mycompany.designpatterns.command_pattern.snake_game.invoker;

import com.mycompany.designpatterns.command_pattern.snake_game.command.Command;

public class Player {

    protected Command command;

    public Player() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }

    public void undoButton() {
        this.command.undo();
    }
}
