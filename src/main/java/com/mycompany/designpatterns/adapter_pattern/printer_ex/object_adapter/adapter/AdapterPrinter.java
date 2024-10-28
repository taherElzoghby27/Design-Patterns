package com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.adapter;

import com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.adaptee.Printer;
import com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.target.LegacyPrinter;

public class AdapterPrinter extends Printer {

    final LegacyPrinter legacyPrinter;

    public AdapterPrinter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        this.legacyPrinter.printDoc();
    }

}
