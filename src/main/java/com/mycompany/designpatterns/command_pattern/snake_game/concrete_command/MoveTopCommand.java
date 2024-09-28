package com.mycompany.designpatterns.command_pattern.snake_game.concrete_command;

import com.mycompany.designpatterns.command_pattern.snake_game.receiver.Snake;
import com.mycompany.designpatterns.command_pattern.snake_game.command.Command;

public class MoveTopCommand implements Command {

    private Snake snake;

    public MoveTopCommand(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void execute() {
        snake.moveTop();
    }

    @Override
    public void undo() {
        snake.moveBottom();
    }

}
