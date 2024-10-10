package com.mycompany.designpatterns.command_pattern.robot.receiver;

public class Robot {

    public Robot() {
    }

    public void speak() {
        System.out.println("speak..........");
    }

    public void silent() {
        System.out.println("silent..........");
    }

    public void pickup() {
        System.out.println("pickup..........");
    }

    public void drop() {
        System.out.println("drop..........");
    }

    public void moveRight() {
        System.out.println("move right..........");
    }

    public void moveLeft() {
        System.out.println("move left..........");
    }

    public void moveTop() {
        System.out.println("move top..........");
    }

    public void moveBottom() {
        System.out.println("move bottom..........");
    }
}
