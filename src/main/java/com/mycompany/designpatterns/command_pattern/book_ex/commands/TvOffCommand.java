package com.mycompany.designpatterns.command_pattern.book_ex.commands;

import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Tv;

public class TvOffCommand implements Command {

    final Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }

}
