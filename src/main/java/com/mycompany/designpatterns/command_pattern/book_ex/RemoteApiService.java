package com.mycompany.designpatterns.command_pattern.book_ex;

public class RemoteApiService {

    protected Command command;

    public RemoteApiService(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }

    public void pressUndoButton() {
        this.command.undo();
    }
}
