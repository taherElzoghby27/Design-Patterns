package com.mycompany.designpatterns.decorator_pattern.data_source_examble;

public abstract class DataSourceDecorator implements DataSource {

    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public abstract String readData();

    @Override
    public abstract void writeData(String data);

}
