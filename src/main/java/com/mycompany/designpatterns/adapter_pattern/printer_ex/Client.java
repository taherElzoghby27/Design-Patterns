package com.mycompany.designpatterns.adapter_pattern.printer_ex;

import com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.adaptee.NormalPrinter;
import com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.adaptee.Printer;
import com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.adapter.AdapterPrinter;
import com.mycompany.designpatterns.adapter_pattern.printer_ex.object_adapter.target.LegacyPrinter;

public class Client {
    public static void main(String[] args) {
        LegacyPrinter legacy=new LegacyPrinter();
        Printer printer=new NormalPrinter();
        printer.print();
        Printer adapterP=new AdapterPrinter(legacy);
        adapterP.print();
    }
 
}
