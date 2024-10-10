package com.mycompany.designpatterns.command_pattern.book_ex;

import com.mycompany.designpatterns.command_pattern.book_ex.commands.Command;
import com.mycompany.designpatterns.command_pattern.book_ex.invoker.RemoteApiService;
import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Light;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.LightOffCommand;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.LightOnCommand;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.MacroCommand;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.PcOffCommand;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.PcOnCommand;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.TvOffCommand;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.TvOnCommand;
import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Pc;
import com.mycompany.designpatterns.command_pattern.book_ex.receiver.Tv;

public class client_test {

    public static void main(String[] args) {
        Light light = new Light();
        Tv tv = new Tv();
        Pc pc = new Pc();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        PcOnCommand pcOnCommand = new PcOnCommand(pc);
        PcOffCommand pcOffCommand = new PcOffCommand(pc);
        Command[] partyOn = {lightOnCommand, tvOnCommand, pcOnCommand};
        Command[] partyOff = {lightOffCommand, tvOffCommand, pcOffCommand};
        MacroCommand macroOn = new MacroCommand(partyOn);
        MacroCommand macroOff = new MacroCommand(partyOff);
        RemoteApiService remote = new RemoteApiService();
        remote.setCommand(0, macroOn, macroOff);
        remote.pressOnButton(0);
        remote.pressUndoButton();

    }
}
