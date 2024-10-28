package com.mycompany.designpatterns.templete_method_pattern.concrete_classs;
import com.mycompany.designpatterns.templete_method_pattern.abstract_class.DataMiner;
public class DocDataMiner extends DataMiner {

    @Override
    public void openFile() {
        System.out.println("open doc file....");
    }

    @Override
    public void extractData() {
        System.out.println("extract doc data.....");
    }

    @Override
    public void parseData() {
        System.out.println("parse doc ......");
    }

    @Override
    public void closeFile() {
        System.out.println("close doc file....");
    }

}
