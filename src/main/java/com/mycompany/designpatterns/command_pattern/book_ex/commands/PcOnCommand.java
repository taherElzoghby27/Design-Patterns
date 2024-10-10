/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.command_pattern.book_ex.commands;

import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Pc;

/**
 *
 * @author tataa
 */
public class PcOnCommand implements Command {

    final Pc pc;

    public PcOnCommand(Pc pc) {
        this.pc = pc;
    }

    @Override
    public void execute() {
        pc.on();
    }

    @Override
    public void undo() {
        pc.off();
    }

}
