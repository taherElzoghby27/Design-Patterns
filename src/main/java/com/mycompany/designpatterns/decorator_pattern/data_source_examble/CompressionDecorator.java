package com.mycompany.designpatterns.decorator_pattern.data_source_examble;

public class CompressionDecorator extends DataSourceDecorator {
    
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }
    
    @Override
    public String readData() {
        return this.dataSource.readData() + " Compression to **********";
    }
    
    @Override
    public void writeData(String data) {
        this.dataSource.writeData(data);
    }
    
}
