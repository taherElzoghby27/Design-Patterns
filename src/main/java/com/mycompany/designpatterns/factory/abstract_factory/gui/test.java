package com.mycompany.designpatterns.factory.abstract_factory.gui;
public class test {

    public static void main(String[] args) {
        GUIFactory guiFactory=new WindowsFactory();
        guiFactory.createButton();
        guiFactory.createCheckBox();
        guiFactory=new MacFactory();
        guiFactory.createButton();
        guiFactory.createCheckBox();
    }
}
