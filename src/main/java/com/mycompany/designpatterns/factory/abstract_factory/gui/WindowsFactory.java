package com.mycompany.designpatterns.factory.abstract_factory.gui;

public class WindowsFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

}
