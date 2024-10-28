package com.mycompany.designpatterns.adapter_pattern.file_format_ex.adapter;

import com.mycompany.designpatterns.adapter_pattern.file_format_ex.targett.Format;
import com.mycompany.designpatterns.adapter_pattern.file_format_ex.adaptee.ProgrammingLanguage;

public class AdapterFormat extends Format {

    final ProgrammingLanguage language;

    public AdapterFormat(ProgrammingLanguage formt) {
        this.language = formt;
    }

    @Override
    public void doing() {
        language.doing();
    }

}
