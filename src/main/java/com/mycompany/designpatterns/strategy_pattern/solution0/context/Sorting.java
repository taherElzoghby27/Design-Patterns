package com.mycompany.designpatterns.strategy_pattern.solution0.context;

import com.mycompany.designpatterns.strategy_pattern.solution0.strategyInterface.SearchingTypes;
import com.mycompany.designpatterns.strategy_pattern.solution0.strategyInterface.SortingTypes;

public class Sorting {

    private SortingTypes sortingMode;
    private SearchingTypes searchMode;

    public Sorting(SortingTypes sortingMode) {
        this.sortingMode = sortingMode;
    }

    public SortingTypes getSortingMode() {
        return sortingMode;
    }

    public void setSortingMode(SortingTypes sortingMode) {
        this.sortingMode = sortingMode;
    }

    public void sort(int[] arr) {
        sortingMode.sort(arr);
    }

    public void search(int[] arr) {
        searchMode.search(arr);;
    }

    public SearchingTypes getSearchingMode() {
        return searchMode;
    }

    public void setSearchMode(SearchingTypes searchMode) {
        this.searchMode = searchMode;
    }

}
