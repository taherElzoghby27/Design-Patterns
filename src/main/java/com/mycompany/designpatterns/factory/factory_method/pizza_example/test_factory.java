package com.mycompany.designpatterns.factory.factory_method.pizza_example;

import com.mycompany.designpatterns.factory.factory_method.pizza_example.Creator.ChicagoPizzaStore;
import com.mycompany.designpatterns.factory.factory_method.pizza_example.Creator.NYPizzaStore;
import com.mycompany.designpatterns.factory.factory_method.pizza_example.Creator.PizzaStore;
import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.Pizza;

public class test_factory {

    public static void main(String[] args) {
        System.out.println("welcome ..........");

        PizzaStore ny = new NYPizzaStore();

        Pizza pizza = ny.orderPizza("cheese");
        System.out.println("name : "+pizza.getName());
        PizzaStore chicago = new ChicagoPizzaStore();
        System.out.println("");
        Pizza pizza1 = chicago.orderPizza("clam");
        System.out.println("name : "+pizza1.getName());
    }
}
