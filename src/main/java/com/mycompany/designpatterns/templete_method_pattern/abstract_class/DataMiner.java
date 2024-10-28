package com.mycompany.designpatterns.templete_method_pattern.abstract_class;

public abstract class DataMiner {

    public final void miner() {
        openFile();
        extractData();
        parseData();
        analyzeData();
        if (sendReprt()) {
            sendReport();
        }
        closeFile();
    }

    public abstract void openFile();

    public abstract void extractData();

    public abstract void parseData();

    public void analyzeData() {
        System.out.println("analyze data ....");
    }

    public void sendReport() {
        System.out.println("send report ....");
    }

    public abstract void closeFile();

    public boolean sendReprt() {
        return true;
    }
}
