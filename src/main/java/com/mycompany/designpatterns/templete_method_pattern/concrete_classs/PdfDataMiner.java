package com.mycompany.designpatterns.templete_method_pattern.concrete_classs;

import com.mycompany.designpatterns.templete_method_pattern.abstract_class.DataMiner;
import java.util.Scanner;

public class PdfDataMiner extends DataMiner {

    @Override
    public void openFile() {
        System.out.println("open pdf file....");
    }

    @Override
    public void extractData() {
        System.out.println("extract pdf data.....");
    }

    @Override
    public void parseData() {
        System.out.println("parse pdf ......");
    }

    @Override
    public void closeFile() {
        System.out.println("close pdf file....");
    }

    @Override
    public boolean sendReprt() {
        System.out.print("send report ?? ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.trim().startsWith("y");
    }

}
