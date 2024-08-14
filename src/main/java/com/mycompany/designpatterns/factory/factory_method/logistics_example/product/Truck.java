/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.factory.factory_method.logistics_example.product;

/**
 *
 * @author Taher
 */
public class Truck extends Transport {

    public Truck() {
        System.out.println("Truck");
    }

    @Override
    public void deliver() {
        System.out.println("deliver with Truck");
    }

}
