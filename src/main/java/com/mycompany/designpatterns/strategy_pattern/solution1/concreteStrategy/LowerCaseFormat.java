/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.strategy_pattern.solution1.concreteStrategy;

import com.mycompany.designpatterns.strategy_pattern.solution1.strategyInterface.Format;

/**
 *
 * @author taheramintaherelzoghby
 */
public class LowerCaseFormat implements Format {

    @Override
    public void getTitle(String title) {
        System.out.println(title.toLowerCase());
    }

}
