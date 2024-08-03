package com.mycompany.designpatterns.strategy_pattern.solution0.concreteStrategy;
import com.mycompany.designpatterns.strategy_pattern.solution0.strategyInterface.SearchingTypes;
public class LinearSearchType implements SearchingTypes{

    @Override
    public void search(int[] array) {
        System.out.println("linear search");
    }
}
