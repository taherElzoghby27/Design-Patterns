package com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.adaptee;

public class NormalPrinter extends Printer {

    @Override
    public void print() {
        System.out.println("normal printer");
    }

}
