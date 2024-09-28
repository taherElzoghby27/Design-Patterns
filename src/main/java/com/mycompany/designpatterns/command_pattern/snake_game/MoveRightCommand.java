package com.mycompany.designpatterns.command_pattern.snake_game;

public class MoveRightCommand implements Command {

    private Snake snake;

    public MoveRightCommand(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void execute() {
        snake.moveRight();
    }

    @Override
    public void undo() {
        snake.moveLeft();
    }

}
