package com.mycompany.designpatterns;
import com.mycompany.designpatterns.strategy_pattern.solution1.context.Book;
import com.mycompany.designpatterns.strategy_pattern.solution1.client.HarryPotterBook;
import com.mycompany.designpatterns.strategy_pattern.solution1.concreteStrategy.LowerCaseFormat;
import com.mycompany.designpatterns.strategy_pattern.solution1.client.ReacherBook;
import com.mycompany.designpatterns.strategy_pattern.solution1.concreteStrategy.UpperCaseFormat;
import com.mycompany.designpatterns.strategy_pattern.solution0.concreteStrategy.BubbleSortType;
import com.mycompany.designpatterns.strategy_pattern.solution0.concreteStrategy.InsertionSortType;
import com.mycompany.designpatterns.strategy_pattern.solution0.concreteStrategy.SelectionSortType;
import com.mycompany.designpatterns.strategy_pattern.solution0.context.Sorting;
import java.text.Format;

public class DesignPatterns {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //0
        int[] array = {4, 3, 2, 6};
        Sorting sort = new Sorting(new BubbleSortType());
        sort.sort(array);
        sort = new Sorting(new SelectionSortType());
        sort.sort(array);
        sort = new Sorting(new InsertionSortType());
        sort.sort(array);
        //1
        Book b1=new HarryPotterBook(new LowerCaseFormat());
        b1.getTitleBook("Taher");
        b1.setFormatBook(new UpperCaseFormat());
        b1.getTitleBook("Taher");
        b1=new ReacherBook(new LowerCaseFormat());
        b1.getTitleBook("Ahmed");
        b1.setFormatBook(new UpperCaseFormat());
        b1.getTitleBook("Ahmed");
        
        
    }
}
