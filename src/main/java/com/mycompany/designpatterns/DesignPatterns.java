package com.mycompany.designpatterns;

import com.mycompany.designpatterns.decorator_pattern.coffee_ex.Beverage;
import com.mycompany.designpatterns.decorator_pattern.coffee_ex.CondimentDecorator;
import com.mycompany.designpatterns.decorator_pattern.coffee_ex.DarkRoast;
import com.mycompany.designpatterns.decorator_pattern.coffee_ex.Milk;
import com.mycompany.designpatterns.decorator_pattern.coffee_ex.Mocha;
import com.mycompany.designpatterns.decorator_pattern.data_source_examble.CompressionDecorator;
import com.mycompany.designpatterns.decorator_pattern.data_source_examble.DataSource;
import com.mycompany.designpatterns.decorator_pattern.data_source_examble.EncryptionDecorator;
import com.mycompany.designpatterns.decorator_pattern.data_source_examble.FileDataSource;
import com.mycompany.designpatterns.observer_pattern.Ex1.Observer;
import com.mycompany.designpatterns.observer_pattern.Ex1.PhoneDisplay;
import com.mycompany.designpatterns.observer_pattern.Ex1.TvDisplay;
import com.mycompany.designpatterns.observer_pattern.Ex1.WorkStation;
import com.mycompany.designpatterns.observer_pattern.YoutubeExample.User1;
import com.mycompany.designpatterns.observer_pattern.YoutubeExample.User2;
import com.mycompany.designpatterns.observer_pattern.YoutubeExample.User3;
import com.mycompany.designpatterns.observer_pattern.YoutubeExample.UserObserver;
import com.mycompany.designpatterns.observer_pattern.YoutubeExample.Video;
import com.mycompany.designpatterns.observer_pattern.YoutubeExample.YoutubeChannel;
import com.mycompany.designpatterns.observer_pattern.news_agency_examble.BBCChannel;
import com.mycompany.designpatterns.observer_pattern.news_agency_examble.Channel;
import com.mycompany.designpatterns.observer_pattern.news_agency_examble.NewsAgency;
import com.mycompany.designpatterns.observer_pattern.news_agency_examble.NewsChannel1;
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
//        int[] array = {4, 3, 2, 6};
//        Sorting sort = new Sorting(new BubbleSortType());
//        sort.sort(array);
//        sort = new Sorting(new SelectionSortType());
//        sort.sort(array);
//        sort = new Sorting(new InsertionSortType());
//        sort.sort(array);
//        //1
//        Book b1 = new HarryPotterBook(new LowerCaseFormat());
//        b1.getTitleBook("Taher");
//        b1.setFormatBook(new UpperCaseFormat());
//        b1.getTitleBook("Taher");
//        b1 = new ReacherBook(new LowerCaseFormat());
//        b1.getTitleBook("Ahmed");
//        b1.setFormatBook(new UpperCaseFormat());
//        b1.getTitleBook("Ahmed");
        //observer pattern
        WorkStation station = new WorkStation();
        Observer tvDisplay = new TvDisplay();
        Observer phoneDisplay = new PhoneDisplay();
        Observer phoneDisplay2 = new PhoneDisplay();
        station.addObserver(tvDisplay);
        station.addObserver(phoneDisplay);
        station.addObserver(phoneDisplay2);
        station.setWeather("35 so");
        System.out.println("------------------");
        NewsAgency newsAgency = new NewsAgency();
        Channel newsChannel1 = new NewsChannel1();
        Channel bbcChannel = new BBCChannel();
        newsAgency.addChannel(bbcChannel);
        newsAgency.addChannel(newsChannel1);
        newsAgency.setNews("Software Engineer");
        System.out.println("------------------------");
        YoutubeChannel youtubeChannel1 = new YoutubeChannel("Workout");
        UserObserver u1 = new User1(youtubeChannel1);
        UserObserver u2 = new User2(youtubeChannel1);
        UserObserver u3 = new User3(youtubeChannel1);
        Video v0 = new Video("back workout advanced", "Link back", "time back", "primary photo back");
        Video v1 = new Video("chest workout advanced", "Link chest", "time chest", "primary photo chest");
        Video v2 = new Video("leg workout advanced", "Link leg", "time leg", "primary photo leg");
        youtubeChannel1.setVideo(v0);
        youtubeChannel1.setVideo(v1);
        youtubeChannel1.unSubscribe(u1);
        youtubeChannel1.setVideo(v2);

        YoutubeChannel youtubeChannel2 = new YoutubeChannel("Programming");
        System.out.println("--------------------------");
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescribtion() + " " + darkRoast.cost());
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Milk(darkRoast);
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDescribtion() + " " + darkRoast.cost());
        System.out.println("---------------------------");
        DataSource dataSource=new FileDataSource("taher amin taher elzoghy");
        System.out.println(dataSource.readData());
        dataSource=new EncryptionDecorator(dataSource);
        System.out.println(dataSource.readData());
        dataSource=new CompressionDecorator(dataSource);
        System.out.println(dataSource.readData());
        dataSource=new EncryptionDecorator(dataSource);
        dataSource.writeData("welcome");
        dataSource=new CompressionDecorator(dataSource);
        System.out.println(dataSource.readData());
        

    }
}
