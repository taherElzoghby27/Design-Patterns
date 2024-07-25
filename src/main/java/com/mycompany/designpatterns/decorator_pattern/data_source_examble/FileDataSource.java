package com.mycompany.designpatterns.decorator_pattern.data_source_examble;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }
    

    @Override
    public void writeData(String data) {
        this.fileName=data;
    }

    @Override
    public String readData() {
        return this.fileName;
    }

}
