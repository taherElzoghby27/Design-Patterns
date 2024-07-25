package com.mycompany.designpatterns.decorator_pattern.data_source_examble;

public class EncryptionDecorator extends DataSourceDecorator {
    
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }
    
    @Override
    public String readData() {
        return this.dataSource.readData() + " Encryption to  *******";
    }
    
    @Override
    public void writeData(String data) {
        this.dataSource.writeData(data);
    }
    
}
