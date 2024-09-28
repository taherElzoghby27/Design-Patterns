package com.mycompany.designpatterns.command_pattern.book_ex;
public class client_test {

    public static void main(String[] args) {
        Light light = new Light();
        RemoteApiService remote = new RemoteApiService(new LightOnCommand(light));
        remote.pressButton();
        remote.pressUndoButton();
        remote = new RemoteApiService(new LightOffCommand(light));
        remote.pressButton();
        remote.pressUndoButton();

    }
}
