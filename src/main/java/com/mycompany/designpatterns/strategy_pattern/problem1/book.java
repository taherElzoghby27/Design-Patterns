package com.mycompany.designpatterns.strategy_pattern.problem1;

enum FormatType {
    LowerCase, UpperCase,
}

public class book {

    private FormatType formatType;

    public book(FormatType formatType) {
        this.formatType = formatType;
    }

    public void setFormatType(FormatType formatType) {
        this.formatType = formatType;
    }

    public void getFormatBook(String title) {
        if (formatType == FormatType.LowerCase) {
            System.out.println(title.toLowerCase());
        } else if (formatType == FormatType.UpperCase) {
            System.out.println(title.toUpperCase());
        }
    }

}
