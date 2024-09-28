package com.mycompany.designpatterns.command_pattern.snake_game;

public class ClientTest {

    public static void main(String[] args) {
        Player player = new Player();
        Snake snake = new Snake(5, 5);
        Command moveRight = new MoveRightCommand(snake);
        Command moveLeft = new MoveLeftCommand(snake);
        Command moveTop = new MoveTopCommand(snake);
        Command moveBottom = new MoveBottomCommand(snake);
        player.setCommand(moveRight);
        player.pressButton();
        player.setCommand(moveRight);
        player.pressButton();
        player.setCommand(moveRight);
        player.pressButton();
        player.setCommand(moveBottom);
        player.pressButton();
        player.setCommand(moveBottom);
        player.pressButton();
        player.setCommand(moveLeft);
        player.pressButton();
        player.setCommand(moveTop);
        player.pressButton();
    }
}
