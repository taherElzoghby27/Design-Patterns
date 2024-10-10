package com.mycompany.designpatterns.command_pattern.book_ex.commands;

import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Pc;

public class PcOffCommand implements Command {

    final Pc pc;

    public PcOffCommand(Pc pc) {
        this.pc = pc;
    }

    @Override
    public void execute() {
        pc.off();
    }

    @Override
    public void undo() {
        pc.on();
    }

}
