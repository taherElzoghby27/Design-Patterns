/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.factory.factory_method.logistics_example.product;

/**
 *
 * @author Taher
 */
public class Car extends Transport {

    public Car() {
        System.out.println("Car");
    }

    @Override
    public void deliver() {
        System.out.println("deliver with Car");
    }

}
