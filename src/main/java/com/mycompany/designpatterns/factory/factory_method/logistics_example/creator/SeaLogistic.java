/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.factory.factory_method.logistics_example.creator;

import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Boat;
import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Ship;
import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Transport;

/**
 *
 * @author Taher
 */
public class SeaLogistic extends TransportLogistics {

    @Override
    public Transport createLogistic(String type) {
        return switch (type) {
            case "Ship" ->
                new Ship();
            case "Boat" ->
                new Boat();
            default ->
                null;
        };
    }

}
