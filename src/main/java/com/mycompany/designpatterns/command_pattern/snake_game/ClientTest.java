package com.mycompany.designpatterns.command_pattern.snake_game;

import com.mycompany.designpatterns.command_pattern.snake_game.receiver.Snake;
import com.mycompany.designpatterns.command_pattern.snake_game.invoker.Player;
import com.mycompany.designpatterns.command_pattern.snake_game.concrete_command.MoveBottomCommand;
import com.mycompany.designpatterns.command_pattern.snake_game.concrete_command.MoveLeftCommand;
import com.mycompany.designpatterns.command_pattern.snake_game.concrete_command.MoveTopCommand;
import com.mycompany.designpatterns.command_pattern.snake_game.concrete_command.MoveRightCommand;
import com.mycompany.designpatterns.command_pattern.snake_game.command.Command;

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
