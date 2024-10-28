package com.mycompany.designpatterns.templete_method_pattern.concrete_classs;

import com.mycompany.designpatterns.templete_method_pattern.abstract_class.DataMiner;

public class CsvDataMiner extends DataMiner {

    @Override
    public void openFile() {
        System.out.println("open csv file....");
    }

    @Override
    public void extractData() {
        System.out.println("extract csv data.....");
    }

    @Override
    public void parseData() {
        System.out.println("parse csv ......");
    }

    @Override
    public void closeFile() {
        System.out.println("close csv file....");
    }

}
