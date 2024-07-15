package com.mycompany.designpatterns.strategy_pattern.solution1.context;

import com.mycompany.designpatterns.strategy_pattern.solution1.strategyInterface.Format;

public class Book {

    private Format format;

    public Book(Format format) {
        this.format = format;
    }

    public void getTitleBook(String title) {
        format.getTitle(title);
    }

    public void setFormatBook(Format format) {
        this.format = format;
    }
}
