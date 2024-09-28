package com.mycompany.designpatterns.command_pattern.snake_game;

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
