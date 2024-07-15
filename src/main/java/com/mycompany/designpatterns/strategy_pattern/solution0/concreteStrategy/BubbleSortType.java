/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.strategy_pattern.solution0.concreteStrategy;

import com.mycompany.designpatterns.strategy_pattern.solution0.strategyInterface.SortingTypes;

/**
 *
 * @author taheramintaherelzoghby
 */
public class BubbleSortType implements SortingTypes {

    @Override
    public void sort(int[] arrayOfNumsÏ) {
        System.out.println("sort by bubble sort algorithm......");
    }

}
