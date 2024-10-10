package com.mycompany.designpatterns.command_pattern.book_ex.commands;

import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Tv;

public class TvOnCommand implements Command {

    final Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

}
