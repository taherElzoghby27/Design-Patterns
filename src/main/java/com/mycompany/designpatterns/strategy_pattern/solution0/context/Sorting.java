package com.mycompany.designpatterns.strategy_pattern.solution0.context;

import com.mycompany.designpatterns.strategy_pattern.solution0.strategyInterface.SortingTypes;

public class Sorting {
    private SortingTypes sortingMode;

    public Sorting(SortingTypes sortingMode) {
        this.sortingMode = sortingMode;
    }

    public SortingTypes getSortingMode() {
        return sortingMode;
    }

    public void setSortingMode(SortingTypes sortingMode) {
        this.sortingMode = sortingMode;
    }
    public void sort(int []arr){
         sortingMode.sort(arr);
    }
    
}
