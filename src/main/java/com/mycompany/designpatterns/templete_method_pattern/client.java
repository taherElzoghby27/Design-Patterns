package com.mycompany.designpatterns.templete_method_pattern;
import com.mycompany.designpatterns.templete_method_pattern.abstract_class.DataMiner;
import com.mycompany.designpatterns.templete_method_pattern.concrete_classs.CsvDataMiner;
import com.mycompany.designpatterns.templete_method_pattern.concrete_classs.DocDataMiner;
import com.mycompany.designpatterns.templete_method_pattern.concrete_classs.PdfDataMiner;
public class client {

    public static void main(String[] args) {
        DataMiner pdf = new PdfDataMiner();
        pdf.miner();
        DataMiner doc = new DocDataMiner();
        doc.miner();
        DataMiner csv = new CsvDataMiner();
        csv.miner();
    }
}
