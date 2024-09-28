package com.mycompany.designpatterns.command_pattern.snake_game.concrete_command;

import com.mycompany.designpatterns.command_pattern.snake_game.receiver.Snake;
import com.mycompany.designpatterns.command_pattern.snake_game.command.Command;

public class MoveBottomCommand implements Command {

    private Snake snake;

    public MoveBottomCommand(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void execute() {
        snake.moveBottom();
    }

    @Override
    public void undo() {
        snake.moveTop();
    }

}
