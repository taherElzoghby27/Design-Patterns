/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.factory.factory_method.logistics_example;

import com.mycompany.designpatterns.factory.factory_method.logistics_example.creator.RoadLogis;
import com.mycompany.designpatterns.factory.factory_method.logistics_example.creator.SeaLogistic;
import com.mycompany.designpatterns.factory.factory_method.logistics_example.creator.TransportLogistics;
import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Transport;

/**
 *
 * @author Taher
 */
public class test {

    public static void main(String[] args) {
        TransportLogistics tra = new RoadLogis();
        Transport transport = tra.createLogistic("Truck");
        transport.deliver();
        tra = new RoadLogis();
        transport = tra.createLogistic("Car");
        transport.deliver();
        tra = new SeaLogistic();
        transport = tra.createLogistic("Ship");
        transport.deliver();
        tra = new SeaLogistic();
        transport = tra.createLogistic("Boat");
        transport.deliver();
    }
}
