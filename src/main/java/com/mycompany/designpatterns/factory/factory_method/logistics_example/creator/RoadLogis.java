/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.factory.factory_method.logistics_example.creator;

import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Car;
import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Transport;
import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Truck;

/**
 *
 * @author Taher
 */
public class RoadLogis extends TransportLogistics {

    @Override
    public Transport createLogistic(String type) {
        return switch (type) {
            case "Car" -> new Car();
            case "Truck" -> new Truck();
            default -> null;
        };
    }

}
