package com.mycompany.designpatterns.adapter_pattern.file_format_ex;

import com.mycompany.designpatterns.adapter_pattern.file_format_ex.targett.Format;
import com.mycompany.designpatterns.adapter_pattern.file_format_ex.targett.JsonFormat;
import com.mycompany.designpatterns.adapter_pattern.file_format_ex.targett.XmlFormat;
import com.mycompany.designpatterns.adapter_pattern.file_format_ex.adapter.AdapterFormat;
import com.mycompany.designpatterns.adapter_pattern.file_format_ex.adaptee.DartLanguage;
import com.mycompany.designpatterns.adapter_pattern.file_format_ex.adaptee.JavaLanguage;
import com.mycompany.designpatterns.adapter_pattern.file_format_ex.adaptee.ProgrammingLanguage;

public class client {

    public static void main(String[] args) {
        Format json = new JsonFormat();
        Format xml = new XmlFormat();
        ProgrammingLanguage dart = new DartLanguage();
        ProgrammingLanguage java = new JavaLanguage();

        json.doing();
        xml.doing();
        Format adapterDart=new AdapterFormat(dart);
        adapterDart.doing();
        Format adapterJava=new AdapterFormat(java);
        adapterJava.doing();
        
    }
}
