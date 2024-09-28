package com.mycompany.designpatterns.command_pattern.snake_game;

public class MoveLeftCommand implements Command {

    private Snake snake;

    public MoveLeftCommand(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void execute() {
        snake.moveLeft();
    }

    @Override
    public void undo() {
        snake.moveRight();
    }

}
