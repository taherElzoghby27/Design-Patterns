/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.strategy_pattern.solution1.client;

import com.mycompany.designpatterns.strategy_pattern.solution1.strategyInterface.Format;
import com.mycompany.designpatterns.strategy_pattern.solution1.context.Book;

/**
 *
 * @author taheramintaherelzoghby
 */
public class HarryPotterBook extends Book{
    
    public HarryPotterBook(Format format) {
        super(format);
        System.out.println("HarryPotter");
    } 
    
}
