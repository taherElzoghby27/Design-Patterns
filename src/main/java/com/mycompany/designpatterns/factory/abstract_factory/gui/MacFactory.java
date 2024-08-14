package com.mycompany.designpatterns.factory.abstract_factory.gui;

public class MacFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

}
