package com.mycompany.designpatterns.command_pattern.book_ex.commands;
public class MacroCommand implements Command {

    protected Command[] macroCommands;

    public MacroCommand(Command[] macroCommands) {
        this.macroCommands = macroCommands;
    }

    @Override
    public void execute() {
        for (Command macroCommand : macroCommands) {
            macroCommand.execute();
        }
    }

    @Override
    public void undo() {
        for (Command macroCommand : macroCommands) {
            macroCommand.undo();
        }
    }

}
